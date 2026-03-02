package com.demo.stock.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.stock.model.Dorm;
import com.demo.stock.repository.DormRepository;

@Service
public class DormService {
    private final DormRepository repository;

    public DormService(DormRepository repository) {
        this.repository = repository;
    }

    public List<Dorm> getDormAll() {
        return repository.findDormAll();
    }

    public Dorm getDormById(Integer id){
        return repository.getDormById(id);
    }

    public void createDorm(Dorm dorm){
        if (dorm == null ) {
            throw new IllegalArgumentException("data is required");
        }
        repository.createDorm(dorm);  
    }

}
