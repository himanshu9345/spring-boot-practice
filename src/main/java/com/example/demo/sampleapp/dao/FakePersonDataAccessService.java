package com.example.demo.sampleapp.dao;

import java.util.ArrayList;
import java.util.UUID;
import java.util.List;
import com.example.demo.sampleapp.model.Person;

public class FakePersonDataAccessService implements PersonDao {

    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        // TODO Auto-generated method stub
       DB.add(new Person(id, person.getName()));
       return 0;
    }

    
}