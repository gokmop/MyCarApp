package com.mca.mycarapp.services.contracts.base;

import com.mca.mycarapp.repository.base.MyCarRepository;
import jakarta.persistence.EntityNotFoundException;

public interface GetService {

    <T, ID> T get(MyCarRepository<T, ID> repository, ID id, Class<T> entityClass) throws EntityNotFoundException;
    <T, ID> T get(MyCarRepository<T, ID> repository, ID id, String message) throws EntityNotFoundException;
}
