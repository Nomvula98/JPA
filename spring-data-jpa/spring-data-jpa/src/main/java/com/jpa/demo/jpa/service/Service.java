package com.jpa.demo.jpa.service;

import com.jpa.demo.jpa.persistance.entities.BookWorm;
import com.jpa.demo.jpa.persistance.repos.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@org.springframework.stereotype.Service
@Transactional
public class Service {

    private final BookWormRepository bookWormRepository;

    public Service(BookWormRepository bookWormRepository) {
        this.bookWormRepository = bookWormRepository;
    }

    public List<BookWorm> findAllBookworms() {
        return bookWormRepository.findAll();
    }
}
