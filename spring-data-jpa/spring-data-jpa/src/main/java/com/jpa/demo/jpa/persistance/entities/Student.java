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
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long s_id;
    private String s_name;


    /**
     * One to many (one student, a collection of books)
     * */
    //One-To-Many relationship between a Student and Library in such a way
    //that one student can be issued more than one type of book.
    @OneToMany(targetEntity=Library.class)
    private List books_issued;



}
