package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;
import com.javarush.task.task36.task3608.model.service.UserService;
import com.javarush.task.task36.task3608.model.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 23.08.2020.
 */
public class MainModel implements Model {
    private ModelData modelData = new ModelData();
    private UserService userService = new UserServiceImpl();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    public void loadDeletedUsers() {
        modelData.setDisplayDeletedUserList(true);
        modelData.setUsers(userService.getAllDeletedUsers());

    }

    @Override
    public void loadUsers() {
        modelData.setDisplayDeletedUserList(false);
        modelData.setUsers(getAllUsers());

    }
    public void loadUserById(long userId) {

        modelData.setActiveUser(userService.getUsersById(userId));
    }

    public void deleteUserById(long id){
        modelData.setDisplayDeletedUserList(false);
        userService.deleteUser(id);
        modelData.setUsers(getAllUsers());
    }
    private List<User> getAllUsers(){
        //modelData.setDisplayDeletedUserList(false);
        return userService.filterOnlyActiveUsers(userService.getUsersBetweenLevels(1,100));

    }
    public void changeUserData(String name, long id, int level){
        userService.createOrUpdateUser(name, id, level);
        modelData.setDisplayDeletedUserList(false);
        modelData.setUsers(getAllUsers());
    }
}
