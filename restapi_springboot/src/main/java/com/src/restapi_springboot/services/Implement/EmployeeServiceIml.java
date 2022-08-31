package com.src.restapi_springboot.services.Implement;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.src.restapi_springboot.entity.EmployeeEntity;
import com.src.restapi_springboot.repository.EmployeeRepository;
import com.src.restapi_springboot.services.EmployeeService;

@Service
public class EmployeeServiceIml implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceIml(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeRepository getEmployeeRepository() {
        return employeeRepository;
    }

    @Override
    public List<EmployeeEntity> findAllEmployees() {

        return employeeRepository.findAll();
    }

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employee) {

        return employeeRepository.save(employee);
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity employee) {

        return employeeRepository.save(employee);
    }

    @Override
    public Optional<EmployeeEntity> findById(long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

}
