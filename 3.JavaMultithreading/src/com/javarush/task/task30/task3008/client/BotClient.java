package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class BotClient extends Client {

    public static void main(String[] args) {
        new BotClient().run();
    }

    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    @Override
    protected String getUserName() {
        return String.format("date_bot_%s", (int) (Math.random()*100));
    }

    public class BotSocketThread extends Client.SocketThread{

        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
            if(!message.contains(":")) return;
            String[] tokens = message.split(": ");

            if(tokens.length != 2) return;

            HashMap<String, String> formats = new HashMap<String, String>() {
                {
                    put("дата", "d.MM.YYYY");
                    put("день", "d");
                    put("месяц", "MMMM");
                    put("год", "YYYY");
                    put("время", "H:mm:ss");
                    put("час", "H");
                    put("минуты", "m");
                    put("секунды", "s");
                }
            };

            if(!formats.containsKey(tokens[1])) return;

            Date date = Calendar.getInstance().getTime();
            SimpleDateFormat format = new SimpleDateFormat(formats.get(tokens[1])); //AUG 18, 2013

            sendTextMessage(String.format("Информация для %s: %s", tokens[0], format.format(date) ));
        }
    }

}
