package com.jpa.demo.jpa.persistance.repos;

import com.jpa.demo.jpa.persistance.entities.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer> {

}
