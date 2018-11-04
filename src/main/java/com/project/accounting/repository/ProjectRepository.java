package com.project.accounting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.accounting.model.Project;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long>{

List<Project> findByCompany(int company);

@Query("select p from Project p where p.company = :company and p.enabled = 1")
List<Project> showActiveProjectByCompany(@Param("company") int company);

@Query("select p from Project p where p.enabled = 1")
List<Project> showActiveProject();

@Transactional
@Modifying
@Query("update Project p set p.enabled = 0 where p.projectId = :id  and p.company = :company")
void disableProject(@Param("id") Long id, @Param("company") int company);

@Query("select p from Project p where p.company = :company and (p.projectName like \'%:searchValue%\'" +
		" or p.projectId like \'%:searchValue%\') and p.enabled= 1")
List<Project> findActiveProjectByIdOrName(@Param("searchValue") String searchValue, @Param("company") int company);

@Query("select p from Project p where p.company = :company and (p.projectName like \'%:searchValue%\'" +
		" or p.projectId like \'%:searchValue%\')")
List<Project> findAllProjectByIdOrName(@Param("searchValue") String searchValue, @Param("company") int company);

}
