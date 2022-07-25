package com.example.sb.repositories;

import com.example.sb.entities.CarBE;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarBE, Long> {
}
