package com.project.accounting.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.accounting.model.Project;
import com.project.accounting.repository.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	ProjectRepository projectRepository;
	
	public Project saveProject(Project project) {
		
		return projectRepository.save(project);
	}
	
	public Project updateProject(Project project) {
		
		return projectRepository.save(project);
	}
	
	public void deleteProject(Project project) {
		projectRepository.delete(project);
	}
	
	public List<Project> getAllProject(){
		
		return projectRepository.findAll();
	}

}
