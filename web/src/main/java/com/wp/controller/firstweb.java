package com.wp.controller;

import com.wp.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstweb {
    @GetMapping("/user")
    public User getUser(){
        User user = new User();
        user.setUsername("wp");
        user.setPassword("ming1118.");
        return  user;
    }
}
