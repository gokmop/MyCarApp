package com.mca.mycarapp.repository;

import com.mca.mycarapp.models.Equipment;
import com.mca.mycarapp.repository.base.MyCarRepository;

import java.util.UUID;

public interface EquipmentRepository extends MyCarRepository<Equipment, UUID> {
}
