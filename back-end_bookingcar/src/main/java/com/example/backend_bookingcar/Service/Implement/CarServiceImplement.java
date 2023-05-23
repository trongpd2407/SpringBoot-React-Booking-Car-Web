package com.example.backend_bookingcar.Service.Implement;

import com.example.backend_bookingcar.Model.Car;
import com.example.backend_bookingcar.Repository.CarRepository;
import com.example.backend_bookingcar.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImplement implements CarService {
    @Autowired
    private CarRepository carRepository;
    @Override
    public Car save(Car car) {
        Car car2 = new Car(car.getCarName(),car.getLicensePlate(),car.getPhonenumber(),car.getNumberOfSeats()
                ,car.getNumberOfSeatsNA(),car.getStartDes(),car.getStopDes(),car.getStartTime(),car.getStopTime(),
                car.getPrice(),car.getImage(),car.getDesc());
        return car2;
    }
    @Override
    public List<Car> getAllCar() {
        return carRepository.findAll();
    }


}
