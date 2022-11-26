package com.mca.mycarapp.modelsTests;

import com.mca.mycarapp.models.Brand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
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
    @DisplayName("Test brand details HashMap")
    public void testBrandDetails(){
        HashMap<String, String> testDetails = new HashMap<>();
        testDetails.put("AC", "Yes");
        testDetails.put("Fog lights" , "Yes");
        brand.setDetails(testDetails);
        assertEquals(testDetails , brand.getDetails());
    }



}
