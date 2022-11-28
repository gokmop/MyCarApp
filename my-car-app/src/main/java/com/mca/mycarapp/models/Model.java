package com.mca.mycarapp.models;

import java.util.Objects;
import java.util.UUID;

public class Model {

    private UUID id;
    private String name;
    private int year;
    private Brand brand;

    public Model() {
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Brand getBrand() {
        return brand;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return id == model.id &&
                year == model.year &&
                Objects.equals(brand, model.brand) &&
                Objects.equals(name, model.name);
    }
}
