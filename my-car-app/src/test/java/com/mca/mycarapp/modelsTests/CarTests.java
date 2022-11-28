package com.mca.mycarapp.modelsTests;

import com.mca.mycarapp.models.Brand;
import com.mca.mycarapp.models.Car;
import com.mca.mycarapp.models.Model;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTests {

    private static Brand brand;
    private static Model model;
    private Car car;

    @BeforeAll
    public static void setup() {
        brand = new Brand();
        brand.setName("Honda");
        brand.setDetails("Japan brand");
        model = new Model();
        model.setName("Accord");
        model.setYear(2022);
        model.setBrand(brand);
    }

    @BeforeEach
    public void carSetup() {
        car = new Car();
        car.setBrand(brand);
        car.setModel(model);
    }

    @Test
    @DisplayName("Test Car nickname")
    public void testName() {
        car.setNickname("Megatron");
        assertEquals("Megatron", car.getNickname());
    }

    @Test
    @DisplayName("Test Car brand")
    public void testBrand() {
        assertEquals("Honda", car.getBrand().getName());
    }

    @Test
    @DisplayName("Test Car model")
    public void testModel() {
        assertEquals("Accord", car.getModel().getName());
    }

    @Test
    @DisplayName("Test Car milleage")
    public void testMileage() {
        car.setMileage(20122);
        assertEquals(20122, car.getMileage());
    }

    @Test
    @DisplayName("Test Car color")
    public void testColor() {
        car.setColor("Silver");
        assertEquals("Silver", car.getColor());
    }

    @Test
    @DisplayName("Test Car plates")
    public void testPlates() {
        car.setPlates("CA1234BK");
        assertEquals("CA1234BK", car.getPlates());
    }

    @Test
    @DisplayName("Test Car frame numbers")
    public void testFrameNumber() {
        car.setFrameNumber("123ABC345DEF678");
        assertEquals("123ABC345DEF678", car.getFrameNumber());
    }

    @Test
    @DisplayName("Test Car horse power")
    public void testHorsePower() {
        car.setHorsePower(200);
        assertEquals(200, car.getHorsePower());
    }

    @Test
    @DisplayName("Test Car seats")
    public void testCarSeats() {
        car.setSeats(5);
        assertEquals(5, car.getSeats());
    }
}
