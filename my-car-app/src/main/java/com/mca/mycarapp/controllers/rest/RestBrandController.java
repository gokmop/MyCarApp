package com.mca.mycarapp.controllers.rest;

import com.mca.mycarapp.models.Brand;
import com.mca.mycarapp.models.dto.CreateBrandDto;
import com.mca.mycarapp.models.dto.mappers.BrandMapper;
import com.mca.mycarapp.services.contracts.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/brands")
@RestController
public class RestBrandController {
    private final BrandService brandService;
    private final BrandMapper brandMapper;

    @Autowired
    public RestBrandController(BrandService brandService, BrandMapper brandMapper){
        this.brandService = brandService;
        this.brandMapper = brandMapper;
    }

    @GetMapping
    Iterable<Brand> showAllBrands(){
        return brandService.getAll();
    }

    @GetMapping("/{id}")
    Brand showOne(@PathVariable UUID id){
        return brandService.getOne(id);
    }

  @PostMapping("/create")
  Brand createBrand(@RequestBody CreateBrandDto dto){
        Brand brand = brandMapper.fromCreateBrandDto(dto);
        brandService.create(brand);
        return brandService.getOne(brand.getId());
  }

  @PostMapping("/update/{id}")
    Brand updateBrand(@PathVariable UUID id, @RequestBody CreateBrandDto dto){
        Brand brand = brandService.getOne(id);
        Brand updateFromDto = brandMapper.fromCreateBrandDto(dto);
        brand.setName(updateFromDto.getName());
        brand.setDetails(updateFromDto.getDetails());
        brandService.update(brand);
        return brand;
  }

  @DeleteMapping("/delete/{id}")
    String deleteBrand(@PathVariable UUID id){
        Brand brandForDelete = brandService.getOne(id);
        brandService.delete(brandForDelete);
        return "Brand Deleted!";
  }
}