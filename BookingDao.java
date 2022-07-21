package com.spring.orm.SweetShopProject.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.SweetShopProject.entities.Booking;
//creating a class
public class BookingDao {
	// HIBERNATE methods
	private HibernateTemplate hibernateTemplate;
//Annonated Method
	@Transactional
	public int insert(Booking booking) {

		// insert
		Integer i = (Integer) this.hibernateTemplate.save(booking);
		return i;

	}

	public Booking getBooking(int bookingId) {
		Booking booking = this.hibernateTemplate.get(Booking.class, bookingId);
		return booking;
	}
//Getter and Setter Method
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
