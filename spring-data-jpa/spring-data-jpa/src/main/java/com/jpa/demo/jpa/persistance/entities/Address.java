package com.jpa.demo.jpa.persistance.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

        private int e_pincode;
        private String e_city;
        private String e_state;

    /**
     * One to one (one student, one address)
     * */
    //One-To-One relationship between a Student and Address in such
    // a way that one student can have one address.
    @OneToOne
    private Student stud;
    }
