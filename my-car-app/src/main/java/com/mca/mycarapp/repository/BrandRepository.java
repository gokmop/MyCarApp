package com.mca.mycarapp.repository;

import com.mca.mycarapp.models.Brand;
import com.mca.mycarapp.repository.base.MyCarRepository;

import java.util.UUID;

public interface BrandRepository extends MyCarRepository<Brand, UUID> {
}
