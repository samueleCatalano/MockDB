package com.develhope.mockdb;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String firstName;
    private String lastName;
    @Column(unique = true, name = "user_email")
    private String email;

}
