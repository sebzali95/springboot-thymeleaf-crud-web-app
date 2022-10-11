package com.example.springboottymeleafcrudwebapp.model;

import lombok.Data;

import javax.persistence.*;


@Table(name = "employees"   )
@Entity
@Data
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

}
