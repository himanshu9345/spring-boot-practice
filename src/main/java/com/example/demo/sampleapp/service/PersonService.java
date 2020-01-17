package com.example.demo.sampleapp.service;

import com.example.demo.sampleapp.dao.PersonDao;
import com.example.demo.sampleapp.model.Person;

public class PersonService{
    
    private final PersonDao personDao;

    public PersonService(PersonDao personDao){
        this.personDao=personDao;
    }

    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }
}