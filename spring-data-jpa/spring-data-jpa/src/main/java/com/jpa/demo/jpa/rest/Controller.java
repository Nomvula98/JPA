package com.jpa.demo.jpa.rest;

import com.jpa.demo.jpa.service.Service;
import com.jpa.demo.jpa.persistance.entities.BookWorm;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "bookworms/")
public class Controller {

    private final Service service;

    //GET BOOKWORMS TABLE
    @GetMapping("all")
    public ResponseEntity<List<BookWorm>> findAllBookworms() {
        List<BookWorm> bookworms = service.findAllBookworms();
        return new ResponseEntity<>(bookworms, HttpStatus.OK);
    }



}
