package com.example.demo.repository;

import com.example.demo.entity.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Long> {
}
