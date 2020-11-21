package com.wyf.study.service;

import com.wyf.study.entity.User;

public interface UserService {
    User searchUser(int id);


    void insertUser(String userName, String passWord, String realName);

    void deleteUserById(int id);

    void updateUser(User user);
}
