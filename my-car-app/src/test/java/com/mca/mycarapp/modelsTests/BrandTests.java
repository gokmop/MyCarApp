package com.mca.mycarapp.modelsTests;

import com.mca.mycarapp.models.Brand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BrandTests {

    private Brand brand;

    @BeforeEach
    public void setup(){
        brand = new Brand();
    }

    @Test
    @DisplayName("Test brand name Setter/Getter")
    public void testName(){
        brand.setName("Audi");
        assertEquals("Audi", brand.getName());
    }

    @Test
    @DisplayName("Test brand details Setter/Getter")
    public void testDetails(){
        brand.setDetails("Established in 1966");
        assertEquals("Established in 1966", brand.getDetails());
    }



}
