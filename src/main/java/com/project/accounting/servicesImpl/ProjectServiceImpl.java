package com.project.accounting.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.accounting.model.Project;
import com.project.accounting.repository.ProjectRepository;
import com.project.accounting.services.ProjectService;

public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	ProjectRepository projectRepository;

	@Override
	public Project saveCa(Project project) {
		// TODO Auto-generated method stub
		return projectRepository.save(project);
	}

	@Override
	public Project updateCa(Project project) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCa(Project project) {
		// TODO Auto-generated method stub

	}

	@Override
	public Project getCaById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> getAllProject() {
		// TODO Auto-generated method stub
		return projectRepository.findAll();
	}

}
