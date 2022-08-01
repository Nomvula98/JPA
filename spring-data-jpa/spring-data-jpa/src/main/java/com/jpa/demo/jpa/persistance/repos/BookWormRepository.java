package com.jpa.demo.jpa.persistance.repos;

import com.jpa.demo.jpa.persistance.entities.BookWorm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookWormRepository extends JpaRepository<BookWorm, Long> {

}
