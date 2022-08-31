package com.src.restapi_springboot.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.src.restapi_springboot.entity.EmployeeEntity;
import com.src.restapi_springboot.services.EmployeeService;

@Controller
@RequestMapping("/my-employee")
public class EmployeeController {

    @RequestMapping("/test")
    @ResponseBody
    public String test() {

        return ("Hello employees !");
    }

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    @ResponseBody
    public List<EmployeeEntity> findAllEmployees() {
        return employeeService.findAllEmployees();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<EmployeeEntity> findEmployeeById(@PathVariable("id") long id) {
        return employeeService.findById(id);
    }

    @PostMapping("/add")
    public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employee) {
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/update")
    public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employee) {
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("{id}")
    public void deleteEmployee(@PathVariable("id") long id) {
        employeeService.deleteEmployee(id);
    }
}
