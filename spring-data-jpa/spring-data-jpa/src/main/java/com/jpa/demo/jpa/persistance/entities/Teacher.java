package com.jpa.demo.jpa.persistance.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String e_name;


    /**
     * Many to one (many teachers, same book)
     * */
    //Many-To-One relationship between a Teacher and Library in such a
    //way that more than one teachers can issued the same book
    @ManyToOne
    private Library lib;

}
