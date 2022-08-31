package com.src.restapi_springboot.controller;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.src.restapi_springboot.entity.StudentEntity;
@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping(value= {"/","/index","home"})
    public String homePage(ModelMap modelMap){
        // add by MapModel
        modelMap.addAttribute("message", "Hello home page");
        StudentEntity students = new StudentEntity(1L,"Senghong","senghong@gmail.com ","0993992","Male");
        modelMap.addAttribute("student",students);
        //  add by arrayList
        ArrayList<StudentEntity> myStudent = new ArrayList<StudentEntity>();
        myStudent.add(new StudentEntity(1L, "SeyHa", "seyha@gmail.com","0998878","male"));
        myStudent.add(new StudentEntity(2L, "Dara", "seyha@gmail.com","098483883", "male"));
        myStudent.add(new StudentEntity(3L, "Kakda", "seyha@gmail.com","093828283", "male"));
        modelMap.addAttribute("myst",myStudent );
        // return student.toString();
        return ("home");
    }
    @RequestMapping(value = "/about" , method = RequestMethod.GET)
    public String pageAbout(ModelMap modelMap){
        modelMap.addAttribute("Message","Hello About page from controller ");
        return ("about/about");
    }

    
}
