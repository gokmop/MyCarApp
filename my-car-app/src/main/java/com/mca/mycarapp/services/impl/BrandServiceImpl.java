package com.mca.mycarapp.services.impl;

import com.mca.mycarapp.models.Brand;
import com.mca.mycarapp.repository.BrandRepository;
import com.mca.mycarapp.services.contracts.BrandService;
import com.mca.mycarapp.services.contracts.base.CreateService;
import com.mca.mycarapp.services.contracts.base.GetService;
import com.mca.mycarapp.services.contracts.base.GetServiceBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class BrandServiceImpl extends GetServiceBase implements BrandService, GetService {

    private final BrandRepository brandRepository;

    @Autowired
    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.findAll();
    }

    @Override
    public Brand getOne(UUID uuid) {
        return get(brandRepository, uuid, Brand.class);
    }


    @Override
    public void create(Brand brand) {
        brandRepository.save(brand);
    }
}
