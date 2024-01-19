/*
 *  File name:  Inventory.java
 *
 *  Programmer:  Tonya Pierce
 *  ULID:  keschae
 *
 *  Date:  October 24, 2017
 *
 *  Class:  IT 168
 *  Lecture Section:  13
 *  Lecture Instructor:  Schaefer
 *  Lab Section:
 *  Lab Instructor:
 */
package edu.ilstu;

import java.time.Year;

/**
 * Represents an inventory of automobiles and related methods
 *
 * @author Schaefer
 *
 */
public class Inventory
{
	private final static int ARRAY_SIZE = 100;
	private static Automobile[] inventory;
	private int size;
	
	/**
	 * Constructor - creates the inventory array
	 */
	public Inventory()
	{
		inventory = new Automobile[ARRAY_SIZE];
	}

	/**
	 * getter for inventory array
	 * 
	 * @return inventory: Automobile[]
	 */
	public Automobile[] getInventory() {
		return inventory;
		}

	/**
	 * setter for inventory
	 * 
	 * @param inventory
	 */
	public void setInventory(Automobile[] inventory) {
		this.inventory = inventory;
		
	}
	
	/**
	 * getter for size
	 * 
	 * @return size: int
	 */
	public int getSize() {
		return size;
	}
	
	/**
	 * setter for size
	 * 
	 * @param size
	 */
	public void setSize(int size) 
	{
		if(size > ARRAY_SIZE)
			this.size = ARRAY_SIZE;
			this.size = size;		
	}
	
	/**
	 * prints inventory array
	 */
	public void displayEntireInventory()
	{
		for(Automobile auto: inventory)
		{if (auto == null)
					return;
			System.out.println(auto);}
	}
	
	/**
	 * prints objects from inventory array is status is "Available"
	 */
	public void displayAvailableInventory() 
	{
		for(Automobile auto: inventory)
		{if (auto == null)
			return;
		if(auto.getStatus().equals("Available"))
		System.out.println(auto);
	}}
	
	/**
	 * prints an object's year, make, and model if status is "Sold"
	 */
	public void displaySoldInventory() 
	{
		for(Automobile auto: inventory)
		{if (auto == null)
			return;
		if(auto.getStatus().equals("Sold"))
		System.out.println(auto.getYear() + " " + auto.getMake() + " " + auto.getModel());}
	}
		
	/**
	 * prints customer infomation for the objects with Customer
	 */
	public void displayBuyersMailList() {
		for(Automobile auto: inventory)
		{if (auto == null)
			return;
		if(auto.getCustomer() != null)
			System.out.println(auto.getCustomer().toString());}
		}
		
	/**
	 * searches inventory for vin number matching the users input
	 * if found, prints out vehicle infomation
	 * 
	 * @param vin
	 */
	public void findExactVehicle(String vin) {
			for(Automobile auto: inventory)
			{
				if (auto == null)
				{System.out.println("Returning to menu...");
					return;}
				if(auto.vin.equals(vin))
				{
					System.out.println("We have found this vehicle: ");
					System.out.println(auto);
					return;
				} 
			}
		
		}

	

		public static void selectionSort(int size) {
			 
			for(int i = 0; i < size - 1; i ++)
			{ 
				for(int j = i +1; j < size; j++) {
	
					if(inventory[i].getYear() > (inventory[j].getYear()))
					{
					Automobile temp = inventory[i];
					inventory[i] = inventory[j];
					inventory[j] = temp;
					}
					
				}
				
			}
		}	
		public void displaySortedInventory() 
		{
			Inventory.selectionSort(size);
			for(Automobile auto: inventory)
			{
				if (auto == null)
				return;
			System.out.println(auto);
		}
		}
		
	}
