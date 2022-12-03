package com.mca.mycarapp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "brand")
public class Brand {
    @Id
    @Column(name = "id")
    private UUID id = UUID.randomUUID();
    @Column(name = "name")
    private String name;

    @Column(name = "details")
    private String details;

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
