package com.unla.tesilvestretfi.services.implementation;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.tesilvestretfi.converters.PersonConverter;
import com.unla.tesilvestretfi.entities.Person;
import com.unla.tesilvestretfi.models.PersonModel;
import com.unla.tesilvestretfi.repositories.IPersonRepository;
import com.unla.tesilvestretfi.services.IPersonService;


@Service("personService")
public class PersonService implements IPersonService {

	@Autowired
	@Qualifier("personRepository")
	private IPersonRepository personRepository;
	
	@Autowired
	@Qualifier("personConverter")
	private PersonConverter personConverter;
	
	@Override
	public List<Person> getAll() {
		return personRepository.findAll();
	}

	@Override
	public PersonModel insertOrUpdate(PersonModel personModel) {
		Person person = personRepository.save(personConverter.modelToEntity(personModel));
		return personConverter.entityToModel(person);
	}

	@Override
	public boolean remove(int id) {
		try {
			personRepository.deleteById(id);
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public PersonModel findById(int id) {
		return personConverter.entityToModel(personRepository.findById(id));
	}

	@Override
	public PersonModel findByName(String name) {
		return personConverter.entityToModel(personRepository.findByName(name));
	}
	
	@Override
	public List<PersonModel> findByDegreeName(String degreeName) {
		List<PersonModel> models = new ArrayList<PersonModel>();
		for (Person person : personRepository.findByDegreeName(degreeName)) {
			models.add(personConverter.entityToModel(person));
		}
		return models;
	}
}
