package com.example.backend_bookingcar.Controller;

import com.example.backend_bookingcar.Model.Car;
import com.example.backend_bookingcar.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/manage_car")
public class ManageCarController {
    @Autowired
    private CarService carService;
    @GetMapping("/list_car")
    List<Car> getAllCar(){
        List<Car> arrayCar = carService.getAllCar();
        return arrayCar;
    }
    @PostMapping("/add")
    public Car newCar(@RequestBody Car car){
        Car car2 = carService.save(car);
        return car2;

    }


}
