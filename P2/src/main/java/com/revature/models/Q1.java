package com.revature.models;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name="-blank")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Q1TableValue {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "customer_id")
    private String customerId;
}
