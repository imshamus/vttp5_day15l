package sg.edu.nus.iss.vttp5a_day15l.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.nus.iss.vttp5a_day15l.model.Person;
import sg.edu.nus.iss.vttp5a_day15l.service.PersonService;
import sg.edu.nus.iss.vttp5a_day15l.utility.Util;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/persons")
public class PersonController
{
    
    @Autowired
    PersonService personService;

    @GetMapping("")
    public String displayPersonList(Model model) {

        List<Person> persons = personService.findAll(Util.keyPerson); // getting the data 
        model.addAttribute("persons", persons); // injecting the data into html
        return "personlist"; // display html
    }
    
    @GetMapping("/create")
    public String showCreatePage(Model model)
    {
        Person p = new Person();
        model.addAttribute("person", p);
    }

    @PostMapping("/create")
    public String 
    {
        // return "personlist"; // page exist but no data, shld redirect to populate instead
        return "redirect:/persons";
    }

    @GetMapping("/delete/{person-id}") // since got hyperlink, it is a getmapping(?)
    public String getMethodName(@PathVariable("person-id") String personId)
    {
        // logic here
        // or shift the logic to service layer
        return "redirect:/persons";
    }


}
