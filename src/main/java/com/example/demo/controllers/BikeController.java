package com.example.demo.controllers;

import com.example.demo.entity.Bike;
import com.example.demo.repository.BikeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BikeController {

    public BikeController(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    private final BikeRepository bikeRepository;

    @GetMapping("/bikes")
    public List<Bike> getBikes() {
        return (List<Bike>) bikeRepository.findAll();
    }

    @PostMapping("/bikes")
    void addBike(@RequestBody Bike bike) {
        bikeRepository.save(bike);
    }


}
