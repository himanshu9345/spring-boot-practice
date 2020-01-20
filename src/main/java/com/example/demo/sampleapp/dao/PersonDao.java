package com.example.demo.sampleapp.dao;

import com.example.demo.sampleapp.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao{
    int insertPerson(UUID id, Person person);
    default int insertPerson (Person person){
        UUID id=UUID.randomUUID();
        return insertPerson(id, person);
    }
    
    List<Person> selectAllPerson();
    Optional<Person> selectPersonByID(UUID id);
    int deletePesonById(UUID id);
    int updatePersonById(UUID id, Person person);
}
