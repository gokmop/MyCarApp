package com.mca.mycarapp.modelsTests;

import com.mca.mycarapp.models.Equipment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EquipmentTests {
    private Equipment equipment;

    @BeforeEach
    public void setup(){
        equipment = new Equipment();
    }

    @Test
    @DisplayName("Test Equipment name Setter/Getter")
    public void testName(){
        equipment.setName("GPS Navigation");
        assertEquals("GPS Navigation", equipment.getName());
    }

    @Test
    @DisplayName("Test Equipment description Setter/Getter")
    public void testDescription(){
        equipment.setDescription("GPS navigation is part of standard multimedia");
        assertEquals("GPS navigation is part of standard multimedia", equipment.getDescription());
    }
}
