package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;

import java.util.ArrayList;

public class FakeModel implements Model {

    private ModelData modelData;

    public FakeModel() {
        modelData = new ModelData();
        loadUsers();
    }

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
////        modelData = new ModelData();
//        List<User> users = modelData.getUsers();
//        users.add(new User("A", 1, 1));
//        users.add(new User("B", 2, 1));
////        modelData.setUsers(users);
        modelData.setUsers(new ArrayList<User>() {{
            add(new User("A", 1, 1));
            add(new User("B", 2, 1));
        }});
    }

    @Override
    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUserById(long userId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteUserById(long id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void changeUserData(String name, long id, int level) {
        throw new UnsupportedOperationException();
    }
}
