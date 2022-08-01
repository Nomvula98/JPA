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
public class BookWorm {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne //many students can be labeled as a bookworm
    Student Student;

    @ManyToOne //many teachers can be labeled as a bookworm
    Teacher teacher;

    /**
     * ManyToMany (many bookworms can be assigned many types of books)
     * */
    @ManyToMany(targetEntity=Library.class)
    private List lib;
}
