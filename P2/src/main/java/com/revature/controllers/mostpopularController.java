package com.revature.controllers;


import com.revature.models.mostpopular;
import com.revature.models.topselling;
import com.revature.repositories.mostpopularRepository;
import com.revature.repositories.topsellingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mostpop")
public class mostpopularController {
    private mostpopularRepository mostRepo;

    @Autowired
    public mostpopularController(mostpopularRepository mostRepo){this.mostRepo=mostRepo;}

    @GetMapping
    public List<mostpopular> getAllUsers(){
        return mostRepo.findAll();
    }


}
