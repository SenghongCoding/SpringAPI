package com.src.restapi_springboot;
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping("/get-all")
    @ResponseBody
    public String getAllStudent(){
        ArrayList<String> students = new ArrayList<String>();
        students.add("dara");
        students.add("12");
        return students.toString();
    }
    @RequestMapping("/get-one")
    @ResponseBody
    public String getOne(){
        return "Hello sengonh";
    }
    @GetMapping("find-firstname")
    @ResponseBody
    public String findStudentByFirstNameandID(
    @RequestParam(name ="firstname" ,required = false, defaultValue = "Dara") String firstname,
    @RequestParam(name = "id") long id
    ){
        System.out.println("id :" + id);
        System.out.println("first name: " + firstname);
        return firstname;
    }
    @RequestMapping("/find-by-id/{id}/gender/{gender}")
    @ResponseBody
    public String findStudentID(
        @PathVariable("id") long studentid,
        @PathVariable("gender") String studentGender
    ){
        System.out.println("ID = " + studentid);
        System.out.println("Gender = " + studentGender);
        return ("id :" + studentid + "   // Gender = " + studentGender);
    }
}
