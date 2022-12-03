package com.mca.mycarapp.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @Column(name = "id")
    private UUID id = UUID.randomUUID();
    @Column(name = "name")
    private String nickname;
    @OneToOne
    @JoinColumn(name = "car_brand_fk")
    private Brand brand;
    @OneToOne
    @JoinColumn(name = "car_model_fk")
    private Model model;
    @Column(name = "mileage")
    private int mileage;
    @Column(name = "color")
    private String color;
    @Column(name = "plates")
    private String plates;
    @Column(name = "frame_number")
    private String frameNumber;
    @Column(name = "horse_power")
    private int horsePower;
    @Column(name = "seats")
    private int seats;


    public Car() {
    }

    public UUID getId() {
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


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Objects.equals(nickname, car.nickname);
    }
}
