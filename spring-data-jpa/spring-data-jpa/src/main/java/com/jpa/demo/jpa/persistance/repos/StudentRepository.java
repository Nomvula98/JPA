package com.jpa.demo.jpa.persistance.repos;

import com.jpa.demo.jpa.persistance.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
