package com.example.backend_bookingcar.Service;



import com.example.backend_bookingcar.Model.Car;

import java.util.List;

public interface CarService {
    Car save(Car car);
    List<Car> getAllCar();
}
