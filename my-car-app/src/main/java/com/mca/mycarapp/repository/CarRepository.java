package com.mca.mycarapp.repository;

import com.mca.mycarapp.repository.base.MyCarRepository;
import com.mca.mycarapp.models.Car;

import java.util.UUID;

public interface CarRepository extends MyCarRepository<Car , UUID> {
}
