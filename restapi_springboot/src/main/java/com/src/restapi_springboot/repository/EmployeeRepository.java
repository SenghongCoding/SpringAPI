package com.src.restapi_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.src.restapi_springboot.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    
}
