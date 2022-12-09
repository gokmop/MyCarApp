package com.mca.mycarapp.services.impl;

import com.mca.mycarapp.models.Brand;
import com.mca.mycarapp.repository.contracts.BrandRepository;
import com.mca.mycarapp.services.contracts.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;

    @Autowired
    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }


    @Override
    public void create(Brand brand) {
        brandRepository.create(brand);
    }

    @Override
    public void update(Brand brand) {
        brandRepository.update(brand);
    }

    @Override
    public void delete(Brand brand) {
        brandRepository.delete(brand);
    }

    @Override
    public Brand getById(int id) {
        return brandRepository.getById(id);
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.getAll();
    }

    @Override
    public List<Brand> filterByName(String name) {
        return brandRepository.filterByName(name);
    }


}
