package com.src.restapi_springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.src.restapi_springboot.entity.StudentEntity;
import com.src.restapi_springboot.repository.StudentsRepository;

@Controller
@RequestMapping("/api_student")
public class ImStController {
    
    @Autowired
    private StudentsRepository studentsRepository;

    @GetMapping("/name")
    @ResponseBody
    public String name(){
        return ("Segnhong");
    }

    @ResponseBody
    @GetMapping
    public List<StudentEntity> findAllStudents(){
        return studentsRepository.findAll();
    }

}
