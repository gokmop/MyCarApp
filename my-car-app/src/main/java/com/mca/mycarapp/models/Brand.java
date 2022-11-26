package com.mca.mycarapp.models;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Brand {
    private long id;
    private String name;
    private HashMap<String, String> details;

    @Autowired
    public Brand() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getDetails() {
        return details;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDetails(HashMap<String, String> details) {
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
