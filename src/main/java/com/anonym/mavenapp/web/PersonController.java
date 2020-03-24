package com.anonym.mavenapp.web;

import com.anonym.mavenapp.bean.Person;
import com.anonym.mavenapp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Author:Anonym
 * 2020/3/24
 */
@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/personIndex")
    @ResponseBody
    public List<Person> index(){

        return personService.queryPersonList();
    }
}
