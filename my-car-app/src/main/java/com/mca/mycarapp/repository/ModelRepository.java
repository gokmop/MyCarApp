package com.mca.mycarapp.repository;

import com.mca.mycarapp.models.Model;
import com.mca.mycarapp.repository.base.MyCarRepository;

import java.util.UUID;

public interface ModelRepository extends MyCarRepository<Model, UUID> {
}
