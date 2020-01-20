package com.example.demo.sampleapp.model;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person{
    private final UUID id;
    private final String name;
    //defined json pro to map person members with incomming json format
    public Person(@JsonProperty("id") UUID id,@JsonProperty("name") String name){
        this.id=id;
        this.name=name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
}