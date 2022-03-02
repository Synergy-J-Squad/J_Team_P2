package com.revature.models;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name="-blank")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Q3TableValue {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "country")
    private String country;

    @Column(name = "sold")
    private String sold;

}