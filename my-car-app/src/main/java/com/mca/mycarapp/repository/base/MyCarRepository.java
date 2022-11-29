package com.mca.mycarapp.repository.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MyCarRepository<T, ID> extends JpaRepository<T, ID>,
        JpaSpecificationExecutor<T> {
}
