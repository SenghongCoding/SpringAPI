package com.src.restapi_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.src.restapi_springboot.entity.EmpEntity;

public interface EmpRepository extends JpaRepository<EmpEntity, Long> {
    
}
