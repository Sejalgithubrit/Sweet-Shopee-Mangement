package com.spring.orm.SweetShopProject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Database name
@Entity
@Table(name = "admintable")
public class Admin {
	@Id
	@Column(name = "admin_id")
	private int adminId;
	@Column(name = "admin_name")
	private String adminName;

	// Getter and setter Method
  
	
	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	// Parameterized Constructor
	public Admin(int adminId, String adminName) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
	}

	// Default Constructor
	public Admin() {

	}
//to String method
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + "]";
	}

}
