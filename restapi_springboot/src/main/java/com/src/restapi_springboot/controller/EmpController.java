package com.src.restapi_springboot.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.src.restapi_springboot.entity.EmpEntity;
import com.src.restapi_springboot.exception.ResourceNotFoundException;
import com.src.restapi_springboot.repository.EmpRepository;

@Controller
@RequestMapping("/api")
public class EmpController {

    @Autowired
    private EmpRepository empRepository;

    @GetMapping
    @ResponseBody
    public List<EmpEntity> getAllEmpEntity() {
        return empRepository.findAll();
    }

    // !create emp REST API
    @PostMapping
    @ResponseBody
    public EmpEntity createEmpEntity(@RequestBody EmpEntity empEntity) {
        return empRepository.save(empEntity);
    }

    // !build get Emp find by id REST APi
    @GetMapping("{id}")
    @ResponseBody
    public ResponseEntity<EmpEntity> getEmpEntityById(@PathVariable long id) {
        EmpEntity empEntity = empRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Emp not in this id:" + id));
        return ResponseEntity.ok(empEntity);
    }
    // !update rest api

    @PutMapping("{id}")
    public ResponseEntity<EmpEntity> updateEmp(@PathVariable long id, @RequestBody EmpEntity empDetail) {
        EmpEntity updateEmp = empRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Emp data has update id :" + id));
        updateEmp.setFirstName(empDetail.getFirstName());
        updateEmp.setLastName(empDetail.getLastName());
        updateEmp.setEmail(empDetail.getEmail());

        empRepository.save(updateEmp);
        return ResponseEntity.ok(updateEmp);

    }

    // ! delete emp
    @DeleteMapping("{id}")
    @ResponseBody
    public ResponseEntity<HttpStatus> deleteEmp(@PathVariable Long id) {
        EmpEntity empEntity = empRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Emp not exist with id:" + id));

        empRepository.delete(empEntity);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
