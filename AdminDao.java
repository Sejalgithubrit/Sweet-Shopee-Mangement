package com.spring.orm.SweetShopProject.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.SweetShopProject.entities.Admin;

public class AdminDao {
	
	//Initialize variables
	private HibernateTemplate hibernateTemplate;
	// HIBERNATE methods
	@Transactional
	public int insert(Admin admin) {

		// insert
		Integer i = (Integer) this.hibernateTemplate.save(admin);
		return i;

	}

	// get the single data(object)
	public Admin getAdmin(int adminId) {
		Admin admin = this.hibernateTemplate.get(Admin.class, adminId);
		return admin;
	}
//Getter and setter method
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
 
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
