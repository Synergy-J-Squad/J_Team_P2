package com.revature.models;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name="-blank")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Q4TableValue {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "hour")
    private String hour;

    @Column(name = "count")
    private String count;


}