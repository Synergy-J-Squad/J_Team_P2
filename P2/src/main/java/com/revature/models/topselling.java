package com.revature.models;

import lombok.*;

import javax.persistence.*;

@Table(name="topselling")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter
public class topselling {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    private String country;
    private String product_category;
    private String qty;



}
