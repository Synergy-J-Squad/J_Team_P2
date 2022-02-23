package com.revature.controllers;


import com.revature.models.User;
import com.revature.repositories.UserRepository;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@NoArgsConstructor
@RestController
@Data
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepo;

    @Autowired
    public UserController(UserRepository userRepo){
        this.userRepo = userRepo;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    @PostMapping//(consumes="application/json",produces="application/json")
    public User addUser(@RequestBody User user){
        
        System.out.println(user);
        return userRepo.save(user);
    }




}
