package com.valid.test.controller;

import com.valid.test.entity.PersonEntity;
import com.valid.test.service.PersonService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT})
public class PersonController {

    private Logger logger = LogManager.getLogger(PersonController.class);

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

    @GetMapping("/person/{id}")
    public ResponseEntity<PersonEntity> findById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(service.getPerson(id).get());
        } catch (Exception e) {
            logger.error("Error:", e);
            return null;
        }
    }

}
