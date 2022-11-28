package com.mca.mycarapp.models;

import java.util.UUID;

public class Equipment {
    private UUID id;
    private String name;
    private String description;

    public Equipment() {
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
