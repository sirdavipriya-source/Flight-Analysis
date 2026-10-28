package com.example.flightanalysis.controller;


import com.example.flightanalysis.model.User;
import com.example.flightanalysis.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class UserController {


    @Autowired
    private UserService service;



    // Signup

    @PostMapping("/signup")
    public User signup(@RequestBody User user){

        return service.signup(user);

    }



    // Login

    @PostMapping("/login")
    public String login(@RequestBody Map<String,String> data){


        boolean status = service.login(
                data.get("email"),
                data.get("password")
        );


        if(status)

            return "SUCCESS";


        return "INVALID";

    }


}