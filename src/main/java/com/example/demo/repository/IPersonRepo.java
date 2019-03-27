package com.example.demo.repository;

import com.example.demo.model.Person;

import java.util.List;

public interface IPersonRepo {
    
        List<Person> fetchAll();
        Person findPersonById(int id);
        boolean addPerson(Person p);
        boolean deletePerson(int id);
        boolean updatePerson(Person p);
}
