package com.spring.orm.SweetShopProject.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.SweetShopProject.entities.Product;
//Creating class
public class ProductDao {
	// HIBERNATE methods
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int insert(Product product) {

		// insert
		Integer i = (Integer) this.hibernateTemplate.save(product);
		return i;

	}

	// get the single data(object)
	public Product getProduct(int productId) {
		Product product = this.hibernateTemplate.get(Product.class, productId);
		return product;
	}
//Getter and Setter Method
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
