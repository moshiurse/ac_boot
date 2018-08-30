package com.project.accounting.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="project")
public class Project {
	
	@Id
	@Column(name="project_id")
	private int projectId;
	
	@Column(name="code")
	private String projectCode;
	
	@Column(name="name")
	private String projectName;
	
	@Column(name="address")
	private String projectAddress;
	
	
	@Column(name="category")
	private String projectCategory;
	
	@Column(name="start")
	private String projectStart;
	
	@Column(name="finish")
	private String finishDate;
	
	@Column(name="company")
	private int company;
	
	@Column(name="created_by")
	private String createdBy;

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectAddress() {
		return projectAddress;
	}

	public void setProjectAddress(String projectAddress) {
		this.projectAddress = projectAddress;
	}

	public String getProjectCategory() {
		return projectCategory;
	}

	public void setProjectCategory(String projectCategory) {
		this.projectCategory = projectCategory;
	}

	public String getProjectStart() {
		return projectStart;
	}

	public void setProjectStart(String projectStart) {
		this.projectStart = projectStart;
	}

	public String getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(String finishDate) {
		this.finishDate = finishDate;
	}


	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectCode=" + projectCode + ", projectName=" + projectName
				+ ", projectAddress=" + projectAddress + ", projectCategory=" + projectCategory + ", projectStart="
				+ projectStart + ", finishDate=" + finishDate + ", company=" + company + ", createdBy=" + createdBy
				+ "]";
	}


	

}
