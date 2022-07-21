package com.spring.orm.SweetShopProject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Table Name
@Entity
@Table(name = "sweettable")
public class Sweet {
	@Id
	@Column(name = "sweet_Id")
	private int sweetId;

	@Column(name = "sweet_Name")
	private String sweetName;

	@Column(name = "sweet_Category")
	private String sweetCategory;

	@Column(name = "sweet_Rate")
	private int sweetRate;

	@Column(name = "sweet_Discount")
	private int sweetDiscountOffer;

	// Getter and setter Method
	public int getSweetId() {
		return sweetId;
	}

	public void setSweetId(int sweetId) {
		this.sweetId = sweetId;
	}

	public String getSweetName() {
		return sweetName;
	}

	public void setSweetName(String sweetName) {
		this.sweetName = sweetName;
	}

	public String getSweetCategory() {
		return sweetCategory;
	}

	public void setSweetCategory(String sweetCategory) {
		this.sweetCategory = sweetCategory;
	}

	public int getSweetRate() {
		return sweetRate;
	}

	public void setSweetRate(int sweetRate) {
		this.sweetRate = sweetRate;
	}

	public int getSweetDiscountOffer() {
		return sweetDiscountOffer;
	}

	public void setSweetDiscountOffer(int sweetDiscountOffer) {
		this.sweetDiscountOffer = sweetDiscountOffer;
	}

	// Parameterized constructor
	public Sweet(int sweetId, String sweetName, String sweetCategory, int sweetRate, int sweetDiscountOffer) {
		super();
		this.sweetId = sweetId;
		this.sweetName = sweetName;
		this.sweetCategory = sweetCategory;
		this.sweetRate = sweetRate;
		this.sweetDiscountOffer = sweetDiscountOffer;
	}

	// Default Constructor
	public Sweet() {

	}

	// To String Method
	@Override
	public String toString() {
		return "Sweet [sweetId=" + sweetId + ", sweetName=" + sweetName + ", sweetCategory=" + sweetCategory
				+ ", sweetRate=" + sweetRate + ", sweetDiscountOffer=" + sweetDiscountOffer + "]";
	}

}
