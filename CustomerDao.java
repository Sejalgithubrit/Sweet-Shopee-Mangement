package com.spring.orm.SweetShopProject.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.SweetShopProject.entities.Customer;
//Creating a class
public class CustomerDao {
	// HIBERNATE methods
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int insert(Customer customer) {

		// insert
		Integer i = (Integer) this.hibernateTemplate.save(customer);
		return i;

	}

	// get the single data(object)
	public Customer getCustomer(int customerId) {
		Customer customer = this.hibernateTemplate.get(Customer.class, customerId);
		return customer;
	}
//Getter and setter Method
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
