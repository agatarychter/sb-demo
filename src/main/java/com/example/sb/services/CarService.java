package com.example.sb.services;

import com.example.sb.entities.CarBE;
import com.example.sb.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<CarBE> listCars() {
        return carRepository.findAll();
    }
}
