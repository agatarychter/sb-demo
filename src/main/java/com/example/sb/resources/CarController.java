package com.example.sb.resources;

import com.example.sb.entities.CarBE;
import com.example.sb.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public ResponseEntity<List<CarBE>> listCars() {
        return ResponseEntity.ok(carService.listCars());
    }
}
