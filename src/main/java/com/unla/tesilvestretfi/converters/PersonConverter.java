package com.unla.tesilvestretfi.converters;

import org.springframework.stereotype.Component;

import com.unla.tesilvestretfi.entities.Person;
import com.unla.tesilvestretfi.models.PersonModel;

@Component("personConverter")
public class PersonConverter {

	public PersonModel entityToModel(Person person) {
		return new PersonModel(person.getId(), person.getName());
	}

	public Person modelToEntity(PersonModel personModel) {
		return new Person(personModel.getId(), personModel.getName());
	}
}

