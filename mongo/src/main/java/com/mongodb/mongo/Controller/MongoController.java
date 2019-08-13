package com.mongodb.mongo.Controller;

import java.math.BigInteger;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

 

import com.mongodb.mongo.Services.userService;

 

@RestController
@RequestMapping("/users")
public class MongoController {

 

    @Autowired
    private userService userservice;
    
    @GetMapping("/add")
    public String createUser(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("emailid") String emailid, @RequestParam("contactNo") BigInteger contactNo)
    {
        
        return userservice.createUser(username, password, emailid, contactNo);
    }
    
}