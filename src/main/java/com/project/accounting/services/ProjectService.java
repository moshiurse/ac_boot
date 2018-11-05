package com.project.accounting.services;

import java.util.List;
import java.util.Optional;

import com.project.accounting.model.Project;


public interface ProjectService {
	
	Project saveProject(Project project);
	
	void deleteProject(Long id, int company);
	
	Optional<Project> getProjectById(Long id);
	
	List<Project> getAllProject();

	List<Project> getActiveProject();

	List<Project> getAllProjectByCompany(int company);

	List<Project> getActiveProjectByCompany(int company);


}
