package com.sgh.controller;

import com.sgh.entity.User;
import com.sgh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("show")
    public List<User> show(){
        List<User> users = userService.selectAllUsers();
        return users;
    }

}
