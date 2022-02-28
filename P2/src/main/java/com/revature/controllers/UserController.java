package com.revature.controllers;


import com.revature.models.User;
import com.revature.repositories.UserRepository;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@Controller
@NoArgsConstructor
@RestController
@Data
@RequestMapping("/users")
public class UserController extends HttpServlet {

    private UserRepository userRepo;

    @Autowired
    public UserController(UserRepository userRepo){
        this.userRepo = userRepo;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    @PostMapping
    public RedirectView addUser(@RequestParam("firstname") String firstname, @RequestParam("password") String password , @RequestParam("lastname") String lastname, @RequestParam("email") String email) {

        User u = new User(null,email,password,firstname,lastname);

        System.out.println(u);
        userRepo.save(u);

        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("http://localhost:8080/com/");

        return redirectView;

    }




}
