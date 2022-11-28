package com.mca.mycarapp.modelsTests;

import com.mca.mycarapp.models.Brand;
import com.mca.mycarapp.models.Model;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ModelTests {
    private Model model;
    private static Brand brand;

    @BeforeAll
    public static void setup(){
        brand = new Brand();
        brand.setName("Honda");
        brand.setDetails("Honda is brand from Japan");
    }

    @BeforeEach
    public void setupModel(){
        model = new Model();
        model.setBrand(brand);
    }

    @Test
    @DisplayName("Test Model name Setter/Getter")
    public void testName(){
        model.setName("Accord");
        assertEquals("Accord", model.getName());
    }

    @Test
    @DisplayName("Test Model name null")
    public void testNameNull(){
        assertNotEquals("Accord", model.getName());
    }

    @Test
    @DisplayName("Test Model year Setter/Getter")
    public void testYear(){
        model.setYear(2021);
        assertEquals(2021, model.getYear());
    }

    @Test
    @DisplayName("Test Model year null")
    public void testYearNull(){
        assertNotEquals(2021, model.getYear());
    }

    @Test
    @DisplayName("Test Model brand name Getter")
    public void testBrand(){
        assertEquals("Honda", model.getBrand().getName());
    }


}
