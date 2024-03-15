package com.chateaseserver.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
//ctrl + shift + F9 --> building maven
@RestController
@RequestMapping(path = "/user")
public class UserController {
   @GetMapping(path = "/get")
    public Map<String, String> getUserDetails() {
       Map<String, String> user = new HashMap<String, String>();
       user.put("name", "naveen");
       System.out.println("HELLO");
       System.out.println("GURU");
       return user;
   }
}
