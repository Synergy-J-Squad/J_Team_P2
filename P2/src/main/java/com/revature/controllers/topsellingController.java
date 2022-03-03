package com.revature.controllers;


import com.revature.models.User;
import com.revature.models.topselling;
import com.revature.repositories.topsellingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import java.util.List;

@RestController
@RequestMapping("/topselling")
public class topsellingController  {
    private topsellingRepository topRepo;

    @Autowired
    public topsellingController(topsellingRepository topRepo){this.topRepo=topRepo;}

    @GetMapping
    public List<topselling> getAllUsers(){
        return topRepo.findAll();
    }



}
