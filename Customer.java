package com.spring.orm.SweetShopProject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//database name
@Entity
@Table(name = "customertable")
public class Customer {
	// Columns name
	@Id
	@Column(name = "customer_id")
	private int customerId;

	@Column(name = "customer_name")
	private String customerName;

	@Column(name = "customer_password")
	private String password;

	@Column(name = "customer_city")
	private String city;

	@Column(name = "customer_state")
	private String state;

	// Constructor
	public Customer(int customerId, String customerName, String password, String city, String state) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.password = password;
		this.city = city;
		this.state = state;
	}

	// getter and setter
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	// default constructor
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	// String Method
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", password=" + password
				+ ", city=" + city + ", state=" + state + "]";
	}

}
