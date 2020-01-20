package com.example.demo.sampleapp.dao;

import java.util.ArrayList;
import java.util.UUID;
import java.util.List;
import com.example.demo.sampleapp.model.Person;

import org.springframework.stereotype.Repository;

@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao {

    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        // TODO Auto-generated method stub
        DB.add(new Person(id, person.getName()));
       return 1;
    }

    

    @Override
    public List<Person> selectAllPerson() {
        // TODO Auto-generated method stub
        return DB;
    }

    @Override
    public int deletePesonById(UUID id) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        // TODO Auto-generated method stub
        return 0;
    }

    
}