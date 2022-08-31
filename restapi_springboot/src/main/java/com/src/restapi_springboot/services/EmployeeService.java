package com.src.restapi_springboot.services;
import java.util.List;
import java.util.Optional;

import com.src.restapi_springboot.entity.EmployeeEntity;
public interface EmployeeService {
    List<EmployeeEntity> findAllEmployees();
    Optional<EmployeeEntity> findById(long id);
    EmployeeEntity saveEmployee(EmployeeEntity employee);
    EmployeeEntity updateEmployee(EmployeeEntity employee);
    void deleteEmployee(Long id);
     
}
