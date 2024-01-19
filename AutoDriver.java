package edu.ilstu;
import java.util.Arrays;
import java.util.Scanner;


public class AutoDriver {
    public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		InputOutput io = new InputOutput();
		Inventory inventory = new Inventory();
				
		int size = io.readInventory(inventory.getInventory());
		inventory.setSize(size);
       
		
		// start menu logic   

        // while
        String choice = null;
    while(choice != "7") {
        // switch
        switch(io.displayMenuGetChoice()) {
            case "1":
                io.displayAutomobileListLabels();
                inventory.displayEntireInventory();
            break;
            case "2":
                io.displayAutomobileListLabels();  
                inventory.displaySortedInventory();
            break;
            case "3":
                io.displayAutomobileListLabels(); 
                inventory.displayAvailableInventory();
            break;
            case "4":
                System.out.println("Recently Sold Automobiles"); 
                inventory.displaySoldInventory();
            break;
            case "5":
                inventory.displayBuyersMailList();
            break;
            case "6":
                System.out.print("Enter VIN: ");
                String vin = keyboard.next();
                inventory.findExactVehicle(vin);
            break;
            case "7":
                System.out.print("Quitting application.");
            return;    
        }
            
    }
            keyboard.close();
}
            
}
