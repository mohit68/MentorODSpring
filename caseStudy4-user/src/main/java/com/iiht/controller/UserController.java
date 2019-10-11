package com.iiht.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.model.User;
import com.iiht.service.UserService;

@RestController
public class UserController {
     @Autowired
     UserService userService;
     
     @GetMapping("/hello")
     String sayHello(){
    	 return "hello";
     }
     
     @GetMapping("/user")
     public List<User> getAllUser(){
    	 return userService.getAllUser();
     }
     
     @PostMapping("/user")
     public void insertUser(@RequestBody User user) {
    	 userService.saveUser(user);
     }
     
     @DeleteMapping("/delete/{id}")
     public void deleteUser(@PathVariable Long id){
    	 userService.deleteUser(id);
     }
     
     @PutMapping("/update/{id}")
     public void updateUser(@PathVariable long id,@RequestBody User user){
    	 userService.updateUser(id,user);
     }
     
}