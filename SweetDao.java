package com.spring.orm.SweetShopProject.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.SweetShopProject.entities.Sweet;
//Creating class
public class SweetDao {
	// HIBERNATE methods

	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int insert(Sweet sweet) {

		// insert
		Integer i = (Integer) this.hibernateTemplate.save(sweet);
		return i;

	}

	// get the single data(object)
	public Sweet getSweet(int sweetId) {
		Sweet sweet = this.hibernateTemplate.get(Sweet.class, sweetId);
		return sweet;
	}

	public Sweet getSweetId(int sweetId) {
		Sweet sweet = this.hibernateTemplate.get(Sweet.class, sweetId);
		return sweet;
	}

	// deleting the data
	@Transactional
	public void deleteSweet(int sweetId) {
		Sweet sweetDel = this.hibernateTemplate.get(Sweet.class, sweetId);
		this.hibernateTemplate.delete(sweetDel);
	}

	// updating data
	@Transactional
	public void updateSweet(Sweet sweet) {
		this.hibernateTemplate.update(sweet);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}