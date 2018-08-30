package com.project.accounting.services;

import java.util.List;

import com.project.accounting.model.Project;


public interface ProjectService {
	
	Project saveCa(Project project);
	
	Project updateCa(Project project);
	
	void deleteCa(Project project);
	
	Project getCaById(int id);
	
	List<Project> getAllProject();


}
