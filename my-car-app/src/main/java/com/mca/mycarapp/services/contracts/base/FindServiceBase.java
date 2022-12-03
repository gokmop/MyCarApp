package com.mca.mycarapp.services.contracts.base;

import com.mca.mycarapp.repository.base.MyCarRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.jpa.domain.Specification;

import java.util.Optional;

public class FindServiceBase implements FindService{

    protected FindServiceBase(){

    }

    @Override
    public <T, ID> T find(MyCarRepository<T, ID> repository, Specification<T> spec, String message) throws EntityNotFoundException {
        Optional<T> optional = repository.findOne(spec);
        return optional.orElseThrow(()-> new EntityNotFoundException(message));
    }
}
