package com.revature.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "cleandata")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CleanData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer order_id;

    private String customer_id;
    private String customer_name;
    private String product_category;
    private String product_name;
    private Integer product_id;
    private String payment_type;
    private Integer qty;
    private float price;
    private String datetime;
    private String country;
    private String city;
    private String ecommerce_website_name;
    private String payment_txn_id;
    private String payment_txn_success;
    private String failure_reason;




}
