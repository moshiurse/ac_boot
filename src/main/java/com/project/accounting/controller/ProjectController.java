package com.project.accounting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.accounting.model.Project;
import com.project.accounting.servicesImpl.ProjectService;

@Controller
public class ProjectController {
	
	@Autowired
	ProjectService projectService;
	
	@RequestMapping(value="/saveProject", method= RequestMethod.POST)
	public String saveProject(@RequestBody Project project) {
		projectService.saveProject(project);
		
		return "";
	}
	
	@RequestMapping(value="/showProject", method= RequestMethod.POST)
	public @ResponseBody List<Project> showAllProject(){
		
		return projectService.getAllProject();
	}
	
	

}
