package com.anonym.mavenapp.web;

import com.anonym.mavenapp.bean.User;
import com.anonym.mavenapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Author:Anonym
 * 2020/3/19
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userIndex")
    @ResponseBody
    public List<User> index(){

       return userService.queryUserList();

    }
}
