package com.wyf.study.controller;

import com.wyf.study.entity.Role;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Controller
public class SessionTest {

    @GetMapping("/")
    public String sessionTest01(HttpSession session){

        Role role = new Role("刻晴", 17);
        session.setAttribute("role",role);
        return "test";
    }
}
