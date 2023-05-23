package com.example.backend_bookingcar.Controller;
import com.example.backend_bookingcar.Model.Car;
import com.example.backend_bookingcar.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("")
public class CarController {
    @Autowired
    private CarService carService;
    @GetMapping("/home")
    List<Car> getAllCar(){
        List<Car> arrayCar = carService.getAllCar();
        return arrayCar;
    }
}
