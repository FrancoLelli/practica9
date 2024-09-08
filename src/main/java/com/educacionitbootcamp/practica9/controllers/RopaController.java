package com.educacionitbootcamp.practica9.controllers;

import com.educacionitbootcamp.practica9.models.Ropa;
import com.educacionitbootcamp.practica9.repositories.RopaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ropa")
public class RopaController{

    @Autowired
    private RopaRepository ropaRepository;

    @PostMapping("/crear")
    public Ropa crearRopa(@RequestBody Ropa ropa){
        return this.ropaRepository.save(ropa);
    }

}
