
/*
 *  File name:  Automobile.java
 *
 *  Programmer:  Kevin Schaefer
 *  ULID:  keschae
 *
 *  Date:  October 24, 2017
 *
 *  Class:  IT 168
 *  Lecture Section:  22
 *  Lecture Instructor:  Schaefer
 *  Lab Section:
 *  Lab Instructor:
 */
package edu.ilstu;

/**
 * Holds information about an automobile
 *
 * @author Schaefer and Danielle Stewart
 *
 */
public class Automobile
{	
	private int year = 0;
	private String make = "";
	private String model = "";
	private double price = 0.0;
	private String condition = "";
	private int rating = 0;
	private String status = "";
	String vin = "";
	private Customer customer = null;
	
//  Customer vars
//	private String firstName;
//	private String lastName;
//	private String streetAddress;
//	private String city;
//	private String state;
//	private String zip;
//	private String email;
//	private String phone;
	
	/**
	 * Constructor
	 * 
	 * @param year
	 * @param make
	 * @param model
	 * @param price
	 * @param condition
	 * @param rating
	 * @param status
	 * @param vin
	 */
	public Automobile(int year, String make, String model, double price, 
			String condition, int rating, String status, String vin) 
	{
		super();
		this.year = year;
		this.make = make;
		this.model = model;
		this.price = price;
		this.condition = condition;
		this.rating = rating;
		this.status = status;
		this.vin = vin;
	}

	/**
	 * Constuctor - w/ Customer
	 * 
	 * @param year
	 * @param make
	 * @param model
	 * @param price
	 * @param condition
	 * @param rating
	 * @param status
	 * @param vin
	 * @param customer
	 */
	public Automobile(int year, String make, String model, double price, 
			String condition, int rating, String status, String vin, Customer customer) 
	{
		super();
		this.year = year;
		this.make = make;
		this.model = model;
		this.price = price;
		this.condition = condition;
		this.rating = rating;
		this.status = status;
		this.vin = vin;
		this.customer = customer;
	}

	/**
	 * getter for year
	 * 
	 * @return year: int
	 */
	public int getYear() {
		return year;
	}

	/**
	 * getter for make
	 * 
	 * @return make: String
	 */
	public String getMake() {
		return make;
	}

	/**
	 * getter for model
	 * 
	 * @return model: String
	 */
	public String getModel() {
		return model;
	}

	/**
	 * getter for status
	 * 
	 * @return status: String
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * getter for customer
	 * 
	 * @return customer: Customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	@Override
	public String toString() {
	    return String.format("%-5s %-12s %-12s %10.2f %-10s %6d %-11s %8s ",
	    		year, make, model, price, condition, rating, status, vin );
	}	
	
	/**
	 * tests if VIN numbers match
	 * 
	 * @param other
	 * @return t/f boolean
	 */
	public boolean equals(Automobile other)
	{
		boolean areEqual = false;
		if( this.vin.equals( other.vin ))
			areEqual = true;
		return areEqual;
	}
	
}
