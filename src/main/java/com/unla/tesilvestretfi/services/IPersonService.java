package com.unla.tesilvestretfi.services;
import java.util.List;

import com.unla.tesilvestretfi.entities.Person;
import com.unla.tesilvestretfi.models.PersonModel;


public interface IPersonService {

	public List<Person> getAll();
	
	public PersonModel findById(int id);
	
	public PersonModel findByName(String name);
	
	public PersonModel insertOrUpdate(PersonModel personModel);
	
	public boolean remove(int id);
	
	public List<PersonModel> findByDegreeName(String degreeName);
}

