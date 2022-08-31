package com.src.restapi_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.src.restapi_springboot.entity.StudentEntity;

public interface StudentsRepository extends JpaRepository<StudentEntity , Long >{
    
}
