package com.spring.orm.SweetShopProject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//Database name
@Entity
@Table(name = "booking_table")
public class Booking {
	@Id
	@Column(name = "booking_id")
	private int bookingId;

	@Column(name = "booking_name")
	private String bookingname;

	// Constructor
	public Booking(int bookingId, String bookingname) {

		super();
		this.bookingId = bookingId;
		this.bookingname = bookingname;
	}

	// Default Constructor
	public Booking() {
		super();

	}

	// Getter and Setter Method
	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getBookingname() {
		return bookingname;
	}

	public void setBookingname(String bookingname) {
		this.bookingname = bookingname;
	}

	// To string Method
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingname=" + bookingname + "]";
	}

}
