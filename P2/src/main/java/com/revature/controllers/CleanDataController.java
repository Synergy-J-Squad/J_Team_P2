package com.revature.controllers;

import com.revature.models.CleanData;
import com.revature.models.topselling;
import com.revature.repositories.CleanDataRepository;
import com.revature.repositories.topsellingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cleandata")
public class CleanDataController {
    private CleanDataRepository cleanRepo;

    @Autowired
    public CleanDataController(CleanDataRepository cleanRepo){this.cleanRepo=cleanRepo;}

    @GetMapping
    public List<CleanData> getAllUsers(){
        return cleanRepo.findAll();
    }


}
