package com.mca.mycarapp.services.contracts;

import com.mca.mycarapp.models.Brand;
import com.mca.mycarapp.services.contracts.base.CreateService;
import com.mca.mycarapp.services.contracts.base.GetAll;
import com.mca.mycarapp.services.contracts.base.GetOne;

import java.util.UUID;

public interface BrandService extends GetAll<Brand>, GetOne<Brand, UUID> , CreateService<Brand> {
}
