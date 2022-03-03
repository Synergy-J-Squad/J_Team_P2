package com.revature.controllers;

import com.revature.repositories.AnylaticsTablesRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("-blank-")
public class Q1Controller {



    @GetMapping("/Q2")
    public
    <Q2TableValue> List<Q2TableValue> getTopSellingCountry(){
        System.out.println(Q2Repository.getAllTopSellingCountry();
        List<Q2TableValue> ListS= (List<Q2TableValue>) Q2Repository.getAllTopSellingCountry();

        return ListS;
    }