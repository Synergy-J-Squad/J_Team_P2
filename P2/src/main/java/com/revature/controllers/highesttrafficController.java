package com.revature.controllers;

import com.revature.models.highesttraffic;
import com.revature.models.topselling;
import com.revature.repositories.highesttrafficRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hightraffic")
public class highesttrafficController {

    private highesttrafficRepository highRepo;

    @Autowired
    public highesttrafficController(highesttrafficRepository highRepo){this.highRepo=highRepo;}

    @GetMapping
    public List<highesttraffic> getAllUsers(){
        return highRepo.findAll();
    }

}
