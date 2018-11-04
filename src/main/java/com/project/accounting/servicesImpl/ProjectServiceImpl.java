package com.project.accounting.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.accounting.model.Project;
import com.project.accounting.repository.ProjectRepository;
import com.project.accounting.services.ProjectService;

public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	ProjectRepository projectRepository;

@Override
public Project saveProject(Project project) {
	return projectRepository.save(project);
}

@Override
public void deleteProject(Long id, int company) {
	projectRepository.disableProject(id, company);
}

@Override
public Optional<Project> getProjectById(Long id) {
	return projectRepository.findById(id);
}

@Override
	public List<Project> getAllProject() {

		return projectRepository.findAll();
	}

@Override
public List<Project> getActiveProject() {
	return projectRepository.showActiveProject();
}

@Override
public List<Project> getAllProjectByCompany(int company) {
	return projectRepository.findByCompany(company);
}

@Override
public List<Project> getActiveProjectByCompany(int company) {
	return projectRepository.showActiveProjectByCompany(company);
}

}
