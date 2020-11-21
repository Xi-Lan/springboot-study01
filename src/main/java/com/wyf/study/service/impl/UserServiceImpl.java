package com.wyf.study.service.impl;

import com.wyf.study.dao.UserDao;
import com.wyf.study.entity.User;
import com.wyf.study.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User searchUser(int id) {
        User user = userDao.searchUserById(id);
        return user;
    }



    @Override
    public void insertUser(String userName, String passWord, String realName) {
        userDao.insertUser(userName,passWord,realName);
    }

    @Override
    public void deleteUserById(int id) {
        userDao.deleteUserById(id);
    }

    @Override
    public void updateUser(User user) {
        User user1 = userDao.searchUserById(user.getId());
        BeanUtils.copyProperties(user,user1); //源对象 目标对象
        userDao.insertUser(user1.getUserName(),user1.getPassWord(),user1.getRealName());

    }
}
