package com.spring.orm.SweetShopProject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.orm.SweetShopProject.dao.AdminDao;
import com.spring.orm.SweetShopProject.dao.BookingDao;
import com.spring.orm.SweetShopProject.dao.SweetDao;
import com.spring.orm.SweetShopProject.entities.Admin;
import com.spring.orm.SweetShopProject.entities.Booking;
import com.spring.orm.SweetShopProject.entities.Sweet;
//creating a class
public class Administration {
	//main method
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
		
		// Get the bean
		AdminDao adminDao = context.getBean("adminDao", AdminDao.class);
		SweetDao sweetDao = context.getBean("sweetDao", SweetDao.class);
		BookingDao bookingDao = context.getBean("bookingDao", BookingDao.class);
		boolean result = true;

		// reading the files
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//Print the statement
		System.out.println("Welcome  To Sweet Shop Management.....");
		System.out.println("Administration Part");
		
		// while Loop

		while (result) {
			// Choose an operation
			System.out.println("PRESS 1 for Adding new Admins");
			System.out.println("PRESS 2 for Adding new sweet details");
			System.out.println("PRESS 3 for  Delete sweet details");
			System.out.println("PRESS 4 for Update details of sweet");
			System.out.println("PRESS 5 For  Booking Details");
			System.out.println("PRESS 6 For Exit");

			// Try-catch Block for handling Exception

			try {
				int customerinput = Integer.parseInt(br.readLine());
				//Switch operation for performing various cases
				switch (customerinput) {

				// case 1

				case 1:
					// creating Admin object and setting value
					System.out.println("Enter admin Id: ");
					int adminId = Integer.parseInt(br.readLine());
					System.out.println("Enter admin Name: ");
					String adminName = br.readLine();

					// Creation of Admin
					
					Admin adminObject = new Admin();
					// Setting values 
					adminObject.setAdminId(adminId);
					adminObject.setAdminName(adminName);

					// Performing insert operation
					int result1 = adminDao.insert(adminObject);
					System.out.println("ID : " + adminId + "Admin Name" + adminName);
					System.out.println("Admin added Successfully" + result1);

					break;

				// case 2
				case 2:

					// adding sweet details

					// Sweet Id
					System.out.println("Enter Sweet Id: ");
					int sId = Integer.parseInt(br.readLine());

					// Sweet Name
					System.out.println("Enter Sweet name: ");
					String sName = br.readLine();

					// Category of sweet
					System.out.println("Enter Sweet Category: ");
					String sCategory = br.readLine();

					// Sweet Rate
					System.out.println("Enter Sweet Rate: ");
					int sRate = Integer.parseInt(br.readLine());

					// Sweet Discount
					System.out.println("Enter Sweet Discount Offer % : ");
					int sDiscount = Integer.parseInt(br.readLine());

					// Object of Sweet Class

					Sweet sweet = new Sweet();
					// setting value of Sweet
					sweet.setSweetId(sId);
					sweet.setSweetName(sName);
					sweet.setSweetCategory(sCategory);
					sweet.setSweetRate(sRate);
					sweet.setSweetDiscountOffer(sDiscount);

					// Condition of Discount
					System.out.println("Sweet Discount");
					int sRate1 = sweet.getSweetRate();
					int Discount = sDiscount;
					int s = 100 - Discount;
					sRate1 = (s * sRate1) / 100;
					// Setting the value
					sweet.setSweetRate(sRate1);
					// Print
					System.out.println("Sweet discount is " + sRate1);

					// Inserting data
					int resul = sweetDao.insert(sweet);
					
					System.out.println(" Sweet Record Inserted : " + resul);

					break;
				// case 3

				case 3:
					// Deletion of sweet Details
					System.out.println("Enter sweet id which details you want to delete:");
					int id = Integer.parseInt(br.readLine());
					sweetDao.deleteSweet(id);
					System.out.println("Sweet record  has been deleted successfully.");

					break;
				// case 4
				case 4:
					// update method of sweet
					// Sweet Id
					System.out.println("Enter Sweet Id: ");
					int sweetId = Integer.parseInt(br.readLine());

					// Sweet Name
					System.out.println("Enter Sweet name: ");
					String sweetName = br.readLine();

					// Sweet Category
					System.out.println("Enter Sweet Category: ");
					String sweetCategory = br.readLine();

					// Sweet Rate
					System.out.println("Enter Sweet Rate: ");
					int sweetRate = Integer.parseInt(br.readLine());

					// Sweet Discount
					System.out.println("Enter Sweet Discount Offer % : ");
					int sweetDiscount = Integer.parseInt(br.readLine());

					// creating object
					Sweet sweetsObj = new Sweet();
					// Setting the value
					sweetsObj.setSweetId(sweetId);
					sweetsObj.setSweetName(sweetName);
					sweetsObj.setSweetCategory(sweetCategory);
					sweetsObj.setSweetRate(sweetRate);
					sweetsObj.setSweetDiscountOffer(sweetDiscount);
					

					// passing the value
					sweetDao.updateSweet(sweetsObj);
					System.out.println(" Sweet Details Has Been updated ");

					break;

				// case 5
				case 5:

					// Booking Details
					System.out.println("Enter Sweet Id: ");
					int bookingId = Integer.parseInt(br.readLine());

					// Name
					System.out.println("Enter Sweet name: ");
					String bookingName = br.readLine();

					//Object of Booking class
					Booking booking = new Booking();
					
					//setting the value
					booking.setBookingId(bookingId);
					booking.setBookingname(bookingName);
					
					//Print statement
					System.out.println("Your Booking Id is\t" + bookingId);
					System.out.println("Your Booking Name is\t" + bookingName);

					// inserting the data
					int results = bookingDao.insert(booking);
					// display the data
					System.out.println("ID : " + bookingId + "\tBookingName  " + bookingName);
					//Message of booking done
					System.out.println("Your Booking Done Successfully" + results);

					// case 6
				case 6:
					// exit the program
					result = false;
					break;
				}
				// catch block
			} catch (Exception e) {

				System.out.println("Invalid input!!!");
				System.out.println(e);
			}
		}

		System.out.println("Thank you.....");

		// Closing
		((ClassPathXmlApplicationContext) context).close();
	}
}
