package com.valid.test.service;

import com.valid.test.entity.PersonEntity;
import com.valid.test.repository.PersonRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class PersonService {
    private Logger logger = LogManager.getLogger(PersonService.class);

    @Autowired
    PersonRepository repository;

    public PersonEntity createPerson(PersonEntity person) {
        try {
            person.setProcessing("false");
            return repository.save(person);
        } catch (Exception e) {
            logger.error("Error:", e);
            return null;
        }
    }

    public List<PersonEntity> getPersons() {
        try {
            List<PersonEntity> persons = new ArrayList<>();
            repository.findAll().forEach(persons::add);
            return persons;
        } catch (Exception e) {
            logger.error("Error:", e);
            return null;
        }
    }

    public PersonEntity updatePerson(PersonEntity person) {
        try {
            return repository.save(person);
        } catch (Exception e) {
            logger.error("Error:", e);
            return null;
        }
    }

    public Optional<PersonEntity> getPerson(Long id) {
        try {
            return repository.findById(id);
        } catch (Exception e) {
            logger.error("Error:", e);
            return null;
        }
    }

}
