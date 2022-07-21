package com.spring.orm.SweetShopProject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Database Name
@Entity
@Table(name = "producttable")
public class Product {
	@Id
	// Column name of database
	@Column(name = "product_id")
	private int productid;

	@Column(name = "product_name")
	private String productname;

	@Column(name = "product_quantity")
	private int quantity;

	@Column(name = "product_price")
	private int price;

	@Column(name = "product_totalprice")
	private int totalPrice;

	@Column(name = "overAllprice")
	private int overAllPrice;

	// Parameterized Constructor
	public Product(int productid, String productname, int quantity, int price, int totalPrice, int overAllPrice) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.quantity = quantity;
		this.price = price;
		this.totalPrice = totalPrice;
		this.overAllPrice = overAllPrice;
	}

	// Getter and Setter
	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getOverAllPrice() {
		return overAllPrice;
	}

	public void setOverAllPrice(int overAllPrice) {
		this.overAllPrice = overAllPrice;
	}

	// Default constructor
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	// To string method
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", quantity=" + quantity
				+ ", price=" + price + ", totalPrice=" + totalPrice + ", overAllPrice=" + overAllPrice + "]";
	}

}
