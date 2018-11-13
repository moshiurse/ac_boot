package com.project.accounting.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "project")
public class Project {

@Id
@Column(name = "project_id")
private Long projectId;

@Column(name = "code")
private String projectCode;

@Column(name = "name")
private String projectName;

@Column(name = "address")
private String projectAddress;

@Column(name = "start")
private Date startDate;

@Column(name = "finish")
private Date finishDate;

@Column(name = "company")
private int company;

@Column(name = "enabled")
private int enabled;

@Column(name = "created_by")
 private String createdBy;

public Long getProjectId() {
	return projectId;
}

public void setProjectId(Long projectId) {
	this.projectId = projectId;
}

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

public Date getStartDate() {
	return startDate;
}

public void setStartDate(Date startDate) {
	this.startDate = startDate;
}

public Date getFinishDate() {
	return finishDate;
}

public void setFinishDate(Date finishDate) {
	this.finishDate = finishDate;
}

public int getCompany() {
	return company;
}

public void setCompany(int company) {
	this.company = company;
}

public int getEnabled() {
	return enabled;
}

public void setEnabled(int enabled) {
	this.enabled = enabled;
}

public String getCreatedBy() {
	return createdBy;
}

public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
}


@Override
public String toString() {
	return "Project{" +
			"projectId=" + projectId +
			", projectCode='" + projectCode + '\'' +
			", projectName='" + projectName + '\'' +
			", projectAddress='" + projectAddress + '\'' +
			", startDate=" + startDate +
			", finishDate=" + finishDate +
			", company=" + company +
			", enabled=" + enabled +
			", createdBy='" + createdBy + '\'' +
			'}';
}
}
