package com.mca.mycarapp.models.dto;

import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public class CreateBrandDto {
    public static final String MUST_SELECT_NAME = "Brand name is required!";

    @NotNull
    private UUID brandId;
    @NotNull(message = MUST_SELECT_NAME)
    private String name;
    private String details;

    public CreateBrandDto() {
    }

    public UUID getBrandId() {
        return brandId;
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
}
