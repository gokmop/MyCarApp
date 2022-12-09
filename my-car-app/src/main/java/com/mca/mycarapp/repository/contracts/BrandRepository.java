package com.mca.mycarapp.repository.contracts;

import com.mca.mycarapp.models.Brand;

import java.util.List;
import java.util.UUID;

public interface BrandRepository {

    void create(Brand brand);

    void update(Brand brand);

    void delete(Brand brand);

    Brand getById(int id);

    List<Brand> getAll();

    List<Brand> filterByName(String name);


}
