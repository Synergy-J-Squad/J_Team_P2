package com.revature.models;


import lombok.*;

import javax.persistence.*;


@Table(name = "use")
@Entity
@NoArgsConstructor @AllArgsConstructor @Data
@Setter
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    public User(String firstname, String lastname,String email, String password){
        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;
        this.password=password;

    }
}
