package com.example.demo.service;

import com.example.demo.model.Person;
import com.example.demo.repository.IPersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements IPersonService {

    @Autowired
    IPersonRepo personRepo;

    @Override
    public List<Person> fetchAll() {
        return personRepo.fetchAll();
    }

    @Override
    public Person findPersonById(int id) {
        return null;
    }

    @Override
    public boolean addPerson(Person p) {
        return false;
    }

    @Override
    public boolean deletePerson(int id) {
        return false;
    }

    @Override
    public boolean updatePerson(Person p) {
        return false;
    }
}
