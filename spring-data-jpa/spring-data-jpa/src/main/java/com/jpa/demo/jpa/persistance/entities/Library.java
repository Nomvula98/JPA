package com.jpa.demo.jpa.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int b_id;
    private String b_name;


    /**
     * ManyToMany (many bookworms can be assigned many types of books)
     * */
    @ManyToMany(targetEntity=BookWorm.class)
    private List bwList;

}
