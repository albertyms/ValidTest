package com.valid.test.controller;

import com.valid.test.entity.PersonEntity;
import com.valid.test.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService service;

    @PostMapping("/person")
    private PersonEntity savePerson(@RequestBody PersonEntity person) {
        return service.createPerson(person);
    }

    @GetMapping("/persons")
    private List<PersonEntity> getAllPersons() {
        return service.getPersons();
    }

    @PutMapping("/updatePerson")
    private PersonEntity updatePerson(@RequestBody PersonEntity person) {
        return service.updatePerson(person);
    }

}
