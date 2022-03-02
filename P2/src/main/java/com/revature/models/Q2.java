package com.revature.models;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name="-blank")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Q2TableValue {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "country")
    private String country;

    @Column(name = "product_category")
    private String product_category;

    @Column(name = "qty")
    private String qty;
}