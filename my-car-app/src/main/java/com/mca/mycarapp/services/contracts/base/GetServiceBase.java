package com.mca.mycarapp.services.contracts.base;

import com.mca.mycarapp.repository.base.MyCarRepository;
import jakarta.persistence.EntityNotFoundException;

import java.util.Optional;

public class GetServiceBase implements GetService {

    protected GetServiceBase(){
    }

    private static final String ENTITY_WITH_ID_D_EXIST = "%s with id %s does not exist!";
    @Override
    public <T, ID> T get(MyCarRepository<T, ID> repository, ID id, Class<T> entityClass) throws EntityNotFoundException {
        Optional<T> optional = repository.getReferenceById(id);
        String message = String.format(ENTITY_WITH_ID_D_EXIST, entityClass.getSimpleName(), id);
        return optional.orElseThrow(() -> new EntityNotFoundException(message));
    }

    @Override
    public <T, ID> T get(MyCarRepository<T, ID> repository, ID id, String message) throws EntityNotFoundException {
        Optional<T> optional = repository.findById(id);
        return optional.orElseThrow(()-> new EntityNotFoundException(message));
    }
}
