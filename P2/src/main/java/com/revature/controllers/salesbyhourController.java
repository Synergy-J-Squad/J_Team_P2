package com.revature.controllers;

import com.revature.models.salesbyhour;
import com.revature.models.topselling;
import com.revature.repositories.salesbyhourRepository;
import com.revature.repositories.topsellingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/salesbyhour")
public class salesbyhourController {
    private salesbyhourRepository salesRepo;
    @Autowired
    public salesbyhourController(salesbyhourRepository salesRepo){this.salesRepo=salesRepo;}

    @GetMapping
    public List<salesbyhour> getAllUsers(){
        return salesRepo.findAll();
    }

}
