package com.anonym.mavenapp.service;

import com.anonym.mavenapp.bean.Person;
import com.anonym.mavenapp.slaveofmapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author:Anonym
 * 2020/3/24
 */
@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonMapper personMapper;

    @Override
    public List<Person> queryPersonList() {
        return personMapper.selectPersonList();
    }
}
