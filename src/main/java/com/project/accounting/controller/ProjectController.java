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
//
//	@GetMapping(value="admin/showAll")
//	public @ResponseBody List<Project> showAllProject(){
//
//		return projectService.getAllProject();
//	}
//
//	@GetMapping("admin/showActive")
//	public @ResponseBody List<Project> showActive(){
//
//		return projectService.getActiveProject();
//	}

	@GetMapping(value="/showAll")
	public @ResponseBody List<Project> showAllProjectByCompany(){
		try {
			int company = 1;
			return projectService.getAllProjectByCompany(company);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

@GetMapping(value="/show")
public @ResponseBody List<Project> showAllCompany(){
	try {
		return projectService.getAllProject();
	} catch (Exception e) {
		e.printStackTrace();
		return null;
	}
}


@GetMapping("/showActive")
	public @ResponseBody List<Project> showActiveByCompany(){
		try {
			int company = 1;
			return projectService.getActiveProjectByCompany(company);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(" Error show data");
			return null;
		}

	}

	@PostMapping("/delete/{id}")
	@ResponseBody public void deleteProject(@PathVariable("id") Long id){
		int company = 1;
		projectService.deleteProject(id, company);
	}

}
