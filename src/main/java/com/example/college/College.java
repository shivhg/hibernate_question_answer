package com.example.college;

import javax.persistence.*;

@Entity
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;

    @Column
    String name;

//    @OneToMany
//    Student student;
}
