package com.example.backend_bookingcar.Model;

import jakarta.persistence.*;


@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCar")
    private int idCar;
    @Column(name = "carName")
    private String carName;
    @Column(name = "licensePlate")
    private String licensePlate;
    @Column(name = "phonenumber")
    private String phonenumber;
    @Column(name = "numberOfSeats")
    private int numberOfSeats;
    @Column(name = "numberOfSeatsNA")
    private int numberOfSeatsNA;
    @Column(name = "startDes")
    private String startDes;
    @Column(name = "stopDes")
    private String stopDes;
    @Column(name="startTime")
    private String startTime;
    @Column(name = "stopTime")
    private String stopTime;
    @Column(name = "price")
    private long price;
    @Column(name = "image")
    private String image;
    @Column(name = "description")
    private String description;

    public Car() {
    }
    public Car(String carName, String licensePlate, String phonenumber, int numberOfSeats, int numberOfSeatsNA, String startDes, String stopDes, String startTime, String stopTime, long price, String image, String desc) {
        this.carName = carName;
        this.licensePlate = licensePlate;
        this.phonenumber = phonenumber;
        this.numberOfSeats = numberOfSeats;
        this.numberOfSeatsNA = numberOfSeatsNA;
        this.startDes = startDes;
        this.stopDes = stopDes;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.price = price;
        this.image = image;
        this.description = desc;
    }
    public Car(int idCar, String carName, String licensePlate, String phonenumber, int numberOfSeats, int numberOfSeatsNA, String startDes, String stopDes, String startTime, String stopTime, long price, String image, String desc) {
        this.idCar = idCar;
        this.carName = carName;
        this.licensePlate = licensePlate;
        this.phonenumber = phonenumber;
        this.numberOfSeats = numberOfSeats;
        this.numberOfSeatsNA = numberOfSeatsNA;
        this.startDes = startDes;
        this.stopDes = stopDes;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.price = price;
        this.image = image;
        this.description = desc;
    }



    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeatsNA() {
        return numberOfSeatsNA;
    }

    public void setNumberOfSeatsNA(int numberOfSeatsNA) {
        this.numberOfSeatsNA = numberOfSeatsNA;
    }

    public String getStartDes() {
        return startDes;
    }

    public void setStartDes(String startDes) {
        this.startDes = startDes;
    }

    public String getStopDes() {
        return stopDes;
    }

    public void setStopDes(String stopDes) {
        this.stopDes = stopDes;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String desc) {
        this.description= desc;
    }
}
