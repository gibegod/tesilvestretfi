package com.unla.tesilvestretfi.services;
import java.util.List;

import com.unla.tesilvestretfi.entities.Degree;
import com.unla.tesilvestretfi.models.DegreeModel;


public interface IDegreeService {

	public List<Degree> getAll();
	
	public DegreeModel insertOrUpdate(DegreeModel degreeModel);
	
	public boolean remove(int id);
}

