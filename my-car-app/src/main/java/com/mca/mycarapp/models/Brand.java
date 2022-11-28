package com.mca.mycarapp.models;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.Objects;
import java.util.UUID;

public class Brand {
    private UUID id;
    private String name;

    private String details;

    @Autowired
    public Brand() {
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brand brand = (Brand) o;
        return id == brand.id && Objects.equals(name, brand.name);
    }
}
