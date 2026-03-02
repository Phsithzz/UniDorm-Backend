package com.demo.stock.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.stock.model.Dorm;
import com.demo.stock.service.DormService;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/dorms")
public class DormController {

    private final DormService service;

    public DormController(DormService service) {
        this.service = service;
    }

    @GetMapping
    public List<Dorm> getDormAll() {
        return service.getDormAll();
    }

    @GetMapping("/{id}")
    public Dorm getDormById(@PathVariable Integer id){
        return service.getDormById(id);
    }

    @PostMapping
    public ResponseEntity<Void>  createDorm(@RequestBody Dorm dorm){
        service.createDorm(dorm);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }



}
