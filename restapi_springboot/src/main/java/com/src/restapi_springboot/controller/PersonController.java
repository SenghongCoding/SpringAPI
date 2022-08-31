package com.src.restapi_springboot.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.src.restapi_springboot.entity.PersonEntity;

@Controller
@RequestMapping("/person")
public class PersonController {

    @RequestMapping(value = "add", method = RequestMethod.POST)
    @ResponseBody
    public PersonEntity addPerson(
            @RequestBody PersonEntity person) {
        person.setId(1000L);
        System.out.println(person.toString());
        return (person);
    }

    @RequestMapping(value = "/get-all", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<PersonEntity> getAll() {
        ArrayList<PersonEntity> person = new ArrayList<PersonEntity>();
        person.add(new PersonEntity(1L, "dara", "seng", "It", "Female"));
        person.add(new PersonEntity(2L, "Vatna", "ss", "Accounting", "Male"));
        person.add(new PersonEntity(3L, "Seyha", "seh", "Law", "Male"));
        return person;
    }

    @RequestMapping(value = "find-by-username", method = RequestMethod.GET)
    @ResponseBody
    public String findUserName(
            @RequestParam(name = "username", required = false) String Username) {
        return ("student : username = " + Username);
    }

    @RequestMapping("find-by-id/{id}")
    @ResponseBody
    public String findByid(
            @PathVariable("id") long id) {
        return ("ID : " + id);
    }
}
