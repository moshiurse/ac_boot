package com.project.accounting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.accounting.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer>{

}
