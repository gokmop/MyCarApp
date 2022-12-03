package com.mca.mycarapp.services.contracts.base;

public interface GetOne<T, ID> {

    T getOne(ID id);
}
