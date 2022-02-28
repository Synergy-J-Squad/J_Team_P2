package com.revature.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Table
@Entity
@NoArgsConstructor @AllArgsConstructor @Data
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    private String email;
    private String password;

    private String firstname;
    private String lastname;


}
