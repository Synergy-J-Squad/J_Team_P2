package com.revature.controllers;


import com.revature.models.topselling;

import com.revature.models.topsellingcategory;
import com.revature.repositories.topsellingcategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/topsellingcategory")
public class topsellingcategoryController {
    private topsellingcategoryRepository topRepo;

    @Autowired
    public topsellingcategoryController(topsellingcategoryRepository topRepo){this.topRepo=topRepo;}

    @GetMapping
    public List<topsellingcategory> getAllUsers(){
        return topRepo.findAll();
    }

}
