package com.mca.mycarapp.services.contracts.base;

import com.mca.mycarapp.repository.base.MyCarRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.jpa.domain.Specification;

public interface FindService {
    <T, ID> T find(MyCarRepository<T,ID> repository,
                   Specification<T> spec,
                   String message) throws EntityNotFoundException;
}
