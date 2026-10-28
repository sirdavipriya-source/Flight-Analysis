package com.example.flightanalysis.service;


import com.example.flightanalysis.model.User;
import com.example.flightanalysis.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {


    @Autowired
    private UserRepository repository;



    // Signup

    public User signup(User user){

        return repository.save(user);

    }



    // Login

    public boolean login(String email,String password){


        User user = repository.findByEmail(email);


        if(user != null && user.getPassword().equals(password)){

            return true;

        }


        return false;

    }


}