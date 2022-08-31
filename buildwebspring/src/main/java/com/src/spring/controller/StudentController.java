package com.src.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class StudentController {
    @RequestMapping(value = "get")
    @ResponseBody
    public String getData() {
        return ("Hello new data");
    }
    @RequestMapping("test")
    @ResponseBody
    public static void Test(){
       System.out.println("test");
    }
}
