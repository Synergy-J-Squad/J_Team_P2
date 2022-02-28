package com.revature.controllers;

import com.revature.models.User;
import com.revature.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServlet;


@RestController
@RequestMapping("/login")
public class LoginController extends HttpServlet {

    private UserRepository userRepo;

    @Autowired
    public LoginController(UserRepository userRepo){
        this.userRepo = userRepo;
    }


    @PostMapping
    public RedirectView addUser(@RequestParam("password") String password, @RequestParam("email") String email) {

        User u = userRepo.findByEmail(email);
        RedirectView redirectView = new RedirectView();

        redirectView.setUrl("http://localhost:8080/com/");

        if(u!=null){
            System.out.println(u);

            if (email.equals(u.getEmail()) && password.equals(u.getPassword())) {
                redirectView.setUrl("home.html");
            }
        }
        return redirectView;

    }
}
