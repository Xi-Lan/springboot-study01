package com.wyf.study.controller;

import com.wyf.study.entity.User;
import com.wyf.study.service.UserService;
import com.wyf.study.utils.R;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/testUser")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/search/{id}")
    public R searchUser(@PathVariable int id){
        User user = userService.searchUser(id);
        return R.ok().put("user",user);
    }

    @RequestMapping("/insert")
    public void insertUser(@RequestBody User user){
        userService.insertUser(user.getUserName(),user.getPassWord(),user.getRealName());
    }

    @RequestMapping("/delete/{id}")
    public void deleteUser(@PathVariable int id){
        userService.deleteUserById(id);
    }

    @RequestMapping("/update")
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }
}
