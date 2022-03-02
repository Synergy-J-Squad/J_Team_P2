package com.revature.controllers;

import com.revature.repositories.AnylaticsTablesRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("-blank-")
public class Q1Controller {



    @GetMapping("/Q4")
    public
    <Q4TableValue> List<Q4TableValue> getSalesByHour(){
        System.out.println(Q4Repository.getSalesByHour();
        List<Q4TableValue> ListSale= (List<Q4TableValue>) Q4Repository.getSalesByHour();

        return ListSale;
    }