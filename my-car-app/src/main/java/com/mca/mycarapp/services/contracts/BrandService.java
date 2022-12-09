package com.mca.mycarapp.services.contracts;

import com.mca.mycarapp.models.Brand;
import com.mca.mycarapp.services.contracts.base.*;

import java.util.UUID;

public interface BrandService extends GetAll<Brand>, GetOne<Brand, UUID>,GetService,
        CreateService<Brand>, DeleteService<Brand>, UpdateService<Brand> {
}
