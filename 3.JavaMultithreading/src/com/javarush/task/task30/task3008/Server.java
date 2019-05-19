package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {

    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<String, Connection>();

    public static void main(String[] args) throws IOException {

            int port = ConsoleHelper.readInt();
            ServerSocket socket = new ServerSocket(port);
            System.out.println("Server is running!");
        try {
            while (true){
                Socket userSocket = socket.accept();
                new Handler(userSocket).start();
            }
        } catch (IOException e) {
            socket.close();
            e.printStackTrace();
        }
    }

    private static class Handler extends Thread{
        private Socket socket;
        
        public Handler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            SocketAddress ad = socket.getRemoteSocketAddress();
            ConsoleHelper.writeMessage("New connect: " + ad);
            String userName = null;
            try (Connection connection = new Connection(socket)){
                userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                sendListOfUsers(connection, userName);
                serverMainLoop(connection, userName);
            } catch (Exception e) {
                ConsoleHelper.writeMessage("error connectoin");
            }
            if(userName!=null) {
                connectionMap.remove(userName);
                sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
            }
            ConsoleHelper.writeMessage("connectoin close");

        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException{
            //connection.send(new Message(MessageType.USER_NAME));
            Message messNAME_REQUEST = new Message(MessageType.NAME_REQUEST);
            connection.send(messNAME_REQUEST);
            Message message = null;
            while ((message = connection.receive()).getType() != MessageType.USER_NAME){
                connection.send(messNAME_REQUEST);
            }
            String data = message.getData();
            if(data.isEmpty() || connectionMap.containsKey(data))
                data = serverHandshake(connection);
            else{
                connectionMap.put(data, connection);
                connection.send(new Message(MessageType.NAME_ACCEPTED));
            }


            return data;
        }

        private void sendListOfUsers(Connection connection, String userName) throws IOException{
            for(Map.Entry<String, Connection> entry : connectionMap.entrySet()){
                String uName = entry.getKey();
                Connection uConnection = entry.getValue();
                if(!uName.equals(userName))
                    connection.send(new Message(MessageType.USER_ADDED, uName));
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException{
            while (true){
                Message receivedMessage = connection.receive();
                if(receivedMessage.getType() == MessageType.TEXT){
                    String data = String.format("%s: %s", userName, receivedMessage.getData());
                    sendBroadcastMessage(new Message(MessageType.TEXT, data));
                }
                else
                    ConsoleHelper.writeMessage("Увага");


            }
        }

    }

    public static void sendBroadcastMessage(Message message){
        for(Map.Entry<String, Connection> entry : connectionMap.entrySet()){
            try {
                entry.getValue().send(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
