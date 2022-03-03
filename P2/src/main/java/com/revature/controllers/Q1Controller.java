package com.revature.controllers;

import com.revature.repositories.AnylaticsTablesRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("-blank-")
public class Q1Controller {



    @GetMapping("/Q1")
    public
    <Q1TableValue> List<Q1TableValue> getTopSellingCategory(){
        System.out.println(Q1Repository.getAllTopSellingCategory();
        List<Q1TableValue> LS= (List<Q1TableValue>) Q1Repository.getAllTopSellingCategory();

        return LS;
    }



