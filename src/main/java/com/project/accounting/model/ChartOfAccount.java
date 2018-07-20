package com.project.accounting.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="acc_ca")
public class ChartOfAccount {

	@Id
	@Column(name="ca_id")
	private String caId;
	
	@Column(name="name")
	private String caName;
	
	@Column(name="casg_id")
	private String casgId;
	
	@Column(name="comid")
	private int cacomId;
	
	@Column(name="prjid")
	private String caprjId;
	
	@Column(name="parent")
	private String caParent;
	
	@Column(name="level")
	private Short caLevel;
	
	@Column(name="display")
	private Short display;
	
	@Column(name="created_by")
	private String createdBy;
	
	@Column(name="created_at")
	private String createdAt;
	
	
	public String getCaId() {
		return caId;
	}

	public void setCaId(String caId) {
		this.caId = caId;
	}

	public String getCaName() {
		return caName;
	}

	public void setCaName(String caName) {
		this.caName = caName;
	}

	public String getCasgId() {
		return casgId;
	}

	public void setCasgId(String casgId) {
		this.casgId = casgId;
	}

	public int getCacomId() {
		return cacomId;
	}

	public void setCacomId(int cacomId) {
		this.cacomId = cacomId;
	}

	public String getCaprjId() {
		return caprjId;
	}

	public void setCaprjId(String caprjId) {
		this.caprjId = caprjId;
	}

	public String getCaParent() {
		return caParent;
	}

	public void setCaParent(String caParent) {
		this.caParent = caParent;
	}


	public Short getCaLevel() {
		return caLevel;
	}

	public void setCaLevel(Short caLevel) {
		this.caLevel = caLevel;
	}

	public Short getDisplay() {
		return display;
	}

	public void setDisplay(Short display) {
		this.display = display;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	
	
	@Override
	public String toString() {
		return "ChartOfAccount [caId=" + caId + ", caName=" + caName + ", casgId=" + casgId + ", cacomId=" + cacomId
				+ ", caprjId=" + caprjId + ", caParent=" + caParent + ", caLevel=" + caLevel + ", display=" + display
				+ ", createdBy=" + createdBy + ", createdAt=" + createdAt + "]";
	}
	
	
}
