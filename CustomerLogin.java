package com.spring.orm.SweetShopProject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.orm.SweetShopProject.dao.CustomerDao;
import com.spring.orm.SweetShopProject.dao.ProductDao;
import com.spring.orm.SweetShopProject.dao.SweetDao;
import com.spring.orm.SweetShopProject.entities.Customer;
import com.spring.orm.SweetShopProject.entities.Product;
import com.spring.orm.SweetShopProject.entities.Sweet;

// creating a class
public class CustomerLogin {
	// main method
	public static void main(String[] args) {
		// Class Path
		ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");

		// Get the bean
		CustomerDao customerDao = context.getBean("customerDao", CustomerDao.class);
		SweetDao sweetDao = context.getBean("sweetDao", SweetDao.class);
		ProductDao productDao = context.getBean("productDao", ProductDao.class);

		// Read the data
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean bool = true;
		//Print Statement
		System.out.println("Welcome To Sweet Shop Management ");
		System.out.println(" Customer Part");
		// while Loop
		while (bool) {
			
			// choose the option

			System.out.println("PRESS 1 For Registration");
			System.out.println("PRESS 2 For for Fetching specific sweet ");
			System.out.println("PRESS 3 For Placing Order");
			System.out.println("PRESS 4 For for exit");
			
			// Try-catch block for handling exception
			try {
				int input = Integer.parseInt(br.readLine());
				// switch case for performing various case
				switch (input) { // case 1
				case 1:
					System.out.println(" Please First Register Yourself ");
					// Register customer

					// Customer Id
					System.out.println("Enter Customer Id: ");
					int customerId = Integer.parseInt(br.readLine());

					// Customer Name
					System.out.println("Enter Customer name: ");
					String customerName = br.readLine();

					// Customer Password

					System.out.println("Enter Customer Password: ");
					String customerPassword = br.readLine();

					// Customer City

					System.out.println("Enter Customer City ");

					String customercity = br.readLine();

					// Customer State
					System.out.println("Enter customer State");
					String customerstate = br.readLine();
					// Object
					Customer customer = new Customer();
					// Setting the value
					customer.setCustomerId(customerId);
					customer.setCustomerName(customerName);
					customer.setPassword(customerPassword);
					customer.setCity(customercity);
					customer.setState(customerstate);

					// inserting the value
					int res = customerDao.insert(customer);
					System.out.println(" Successfully Register" + res);
					break;

				// case 2
				case 2:

					// fetching single sweet details
					System.out.println("Enter sweet Id : ");
					int sweetId = Integer.parseInt(br.readLine());
					// Creating object of sweet
					Sweet sweetOb = sweetDao.getSweet(sweetId);
					// Getting the value
					System.out.println("Sweet's Id : " + sweetOb.getSweetId());
					System.out.println("Sweet's Name : " + sweetOb.getSweetName());
					System.out.println("Sweet's Category : " + sweetOb.getSweetCategory());
					System.out.println("Sweet's Rate : " + sweetOb.getSweetRate());
					System.out.println("Sweet's Discount % : " + sweetOb.getSweetDiscountOffer());
					System.out.println();
					break;
					//case 3
				case 3:
					// creating an ArrayList to store the product
					@SuppressWarnings("unused") List<Product> product = new ArrayList<Product>();

					// read input values
					System.out.println("Enter the product details: ");
					// ID
					System.out.print("Product ID: ");
					int productid = Integer.parseInt(br.readLine());
					// Name of Product
					System.out.print("Product Name: ");
					String productName = br.readLine();
					// Quantity of Product
					System.out.print("Quantity: ");
					int quantity = Integer.parseInt(br.readLine());
					// Price of product
					System.out.print("Price (per unit): ");
					int price = Integer.parseInt(br.readLine());

					// calculate total price for a particular product

					int totalPrice;
					int overAllPrice = 0;
					totalPrice = price * quantity;

					overAllPrice = overAllPrice + totalPrice;
					System.out.println("Over all Product price is  " + overAllPrice);
					System.out.println("Your Product Order Proceed Successfully");

					// Object

					Product products = new Product();
					// setting the value
					products.setProductid(productid);
					products.setProductname(productName);
					products.setQuantity(quantity);
					products.setPrice(price);
					int res1 = productDao.insert(products);
					// Printing the value
					System.out.println("ID : " + productid + "Name:  " + productName + "Quantity= " + quantity
							+ "Price= " + price);
					System.out.println(" Successfully Added Product\t" + res1);

					break;
				case 4:
					// exit
					bool = false;
					System.out.println("Thank you for using ");
					break;
				}
				//Catch Block
			} catch (Exception e) {
				//Print Statement
				System.out.println("Invalid Details!!!");
				System.out.println(e);
			}
		}
		//Print statement
		System.out.println("Thank you....");
		//Closing XML
		((ClassPathXmlApplicationContext) context).close();

	}

}
