package sg.edu.nus.iss.vttp5a_day15l.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sg.edu.nus.iss.vttp5a_day15l.model.Person;
import sg.edu.nus.iss.vttp5a_day15l.service.PersonService;


@Controller
@RequestMapping("/tests")
public class TestController 
{
    @Autowired 
    PersonService personSvc;

    @ResponseBody
    @GetMapping("/add")
    public String addPerson()
    {
        Person p = new Person(1, "Darryl", "d@nus.sg");
        personSvc.addPerson("persons", p);

        p = new Person(2, "Chuk", "c@nus.sg");
        personSvc.addPerson("persons", p);

        p = new Person(3, "Kenneth", "k@nus.sg");
        personSvc.addPerson("persons", p);

        return "added persons successfully"; // without responsebody, will have white label error because dont have this html file
    }
    

    /* // display as a list of string
    @ResponseBody
    @GetMapping("/persons")
    public List<String> personFindAll() 
    {
        return personSvc.findAll("persons");
    } */
    
    // display as a JSON of Person obj
    @ResponseBody
    @GetMapping("/persons")
    public List<Person> personFindAll() 
    {
        return personSvc.findAll("persons");
    }

    // Deleting person
    @ResponseBody
    @GetMapping("/delete")
    public Boolean deletePerson() 
    {
        Person p = new Person(3, "Kenneth", "k@nus.sg");
        return personSvc.delete("persons", p);
    }
}
