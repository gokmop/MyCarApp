package com.mca.mycarapp.models.dto.mappers;

import com.mca.mycarapp.models.Brand;
import com.mca.mycarapp.models.dto.CreateBrandDto;
import com.mca.mycarapp.services.contracts.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BrandMapper {

    private final BrandService brandService;

    @Autowired
    public BrandMapper(BrandService brandService){
        this.brandService = brandService;
    }

    public Brand fromCreateBrandDto(CreateBrandDto dto){
        Brand brand = new Brand();
        brand.setName(dto.getName());
        brand.setDetails(dto.getDetails());
        return brand;
    }

    public Brand fromUpdateBrandDto(CreateBrandDto dto){
        Brand brand = brandService.getById(dto.getBrandId());
        brand.setName(dto.getName());
        brand.setDetails(dto.getDetails());
        return brand;
    }
}
