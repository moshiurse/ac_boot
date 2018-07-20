package com.project.accounting.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="acc_project")
public class Project {
	
	@Id
	@Column(name="project_code")
	private String projectCode;
	
	@Column(name="name")
	private String projectName;
	
	@Column(name="address")
	private String projectAddress;
	
	@Column(name="region")
	private String projectRegion;
	
	@Column(name="category")
	private String projectCategory;
	
	@Column(name="start")
	private String projectStart;
	
	@Column(name="finish")
	private String finishDate;
	
	@Column(name="company")
	private int companyId;
	
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

	public String getProjectRegion() {
		return projectRegion;
	}

	public void setProjectRegion(String projectRegion) {
		this.projectRegion = projectRegion;
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

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "ProjectInfo [projectCode=" + projectCode + ", projectName=" + projectName + ", projectAddress="
				+ projectAddress + ", projectRegion=" + projectRegion + ", projectCategory=" + projectCategory
				+ ", projectStart=" + projectStart + ", finishDate=" + finishDate + ", companyId=" + companyId
				+ ", createdBy=" + createdBy + "]";
	}
	
	

}
