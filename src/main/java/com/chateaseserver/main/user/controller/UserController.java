package com.chateaseserver.main.user.controller;

import com.chateaseserver.main.user.model.User;
import com.chateaseserver.main.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

   @Autowired
   private UserService userService;
   @GetMapping(path = "/get")
    public List<User> getUserDetails() {
      return userService.getAllUsers();
   }

   @PostMapping(path = "/register")
   public void registerUser(@RequestBody User user) {
      userService.register(user);
   }
}
