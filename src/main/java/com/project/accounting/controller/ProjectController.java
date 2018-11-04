package com.project.accounting.controller;

import java.util.List;

import com.project.accounting.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.project.accounting.model.Project;

@Controller
@RequestMapping("/project")
public class ProjectController {

	ProjectService projectService;
	
	@RequestMapping(value="/save", method= RequestMethod.POST)
	@ResponseBody public String saveProject(@RequestBody Project project) {

		projectService.saveProject(project);
		return "Project saved Successfully!";
	}
	
	@GetMapping(value="admin/showAll")
	public @ResponseBody List<Project> showAllProject(){
		
		return projectService.getAllProject();
	}

	@GetMapping("admin/showActive")
	public @ResponseBody List<Project> showActive(){

		return projectService.getActiveProject();
	}

	@GetMapping(value="/showAll")
	public @ResponseBody List<Project> showAllProjectByCompany(){
		int company = 1;
		return projectService.getAllProjectByCompany(company);
	}

	@GetMapping("/showActive")
	public @ResponseBody List<Project> showActiveByCompany(){
		int company = 1;
		return projectService.getActiveProjectByCompany(company);
	}

	@PostMapping("/delete/{id}")
	@ResponseBody public void deleteProject(@PathVariable("id") Long id){
		int company = 1;
		projectService.deleteProject(id, company);
	}

}
