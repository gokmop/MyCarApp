package com.mca.mycarapp.models;

import java.util.HashMap;
import java.util.Objects;

public class Car {
    private long id;
    private String nickname;
    private Brand brand;
    private Model model;
    private int mileage;
    private String color;
    private String plates;
    private String frameNumber;
    private int horsePower;
    private int seats;
    private HashMap<String, String> details;

    public Car() {
    }

    public long getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public Brand getBrand() {
        return brand;
    }

    public Model getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public String getColor() {
        return color;
    }

    public String getPlates() {
        return plates;
    }

    public String getFrameNumber() {
        return frameNumber;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getSeats() {
        return seats;
    }

    public HashMap<String, String> getDetails() {
        return details;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPlates(String plates) {
        this.plates = plates;
    }

    public void setFrameNumber(String frameNumber) {
        this.frameNumber = frameNumber;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setDetails(HashMap<String, String> details) {
        this.details = details;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Objects.equals(nickname, car.nickname);
    }
}