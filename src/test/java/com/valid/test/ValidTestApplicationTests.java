package com.valid.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.valid.test.entity.PersonEntity;
import com.valid.test.service.PersonService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ValidTestApplicationTests {

	@Autowired
	PersonService repository;

	@Test
	void contextLoads() {
		PersonEntity person = new PersonEntity();
		person.setName("Albert4");
		person.setLastName("Medina4");

		person = repository.createPerson(person);

		person = new PersonEntity();
		person.setName("Albert5");
		person.setLastName("Medina5");

		person = repository.createPerson(person);

		assertNotNull(person.getId());
	}

}
