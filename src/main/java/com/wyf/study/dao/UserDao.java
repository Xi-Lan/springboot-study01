package com.wyf.study.dao;

import com.wyf.study.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserDao {

     User searchUserById(int id);

    //void insertUser(User user);

    void insertUser(@Param("userName") String userName, @Param("passWord") String passWord, @Param("realName") String realName);

    void deleteUserById(int id);
}
