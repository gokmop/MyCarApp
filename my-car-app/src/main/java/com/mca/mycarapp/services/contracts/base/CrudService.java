package com.mca.mycarapp.services.contracts.base;

public interface CrudService<T, ID> extends GetOne<T, ID>,
        CreateService<T>, UpdateService<T>, DeleteService<T>{
}
