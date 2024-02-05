/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.personcustomerpreferredcustomerdemo;
import java.util.Scanner;

/**
 *
 * @author orlandomarin
 */
public class PersonCustomerPreferredCustomerDemo {

    public static void main(String[] args) 
    {
       System.out.println("Please provide information for a Customer.\n");

       // create a customer object
       Customer customer1 = makeCustomer();
       
       // display the customer object
       displayCustomer(customer1);
       
       System.out.println("Changing the Customer's name and displaying their updated information.");
       
       // change a customer field and display the new customer object
       customer1.setName("Muffin Man");
       displayCustomer(customer1);
       
       System.out.println("Now please provide information for a Preferred Customer.\n");
       
       // create a preferred customer object
       PreferredCustomer preferredCustomer1 = makePreferredCustomer();
       
       // display the preferred customer object
       displayPreferredCustomer(preferredCustomer1);
       
       System.out.println("Changing the Preferred Customer's address and loyalty number, and displaying their updated information.");
       
       // change 2 preferred customer fields and display the new preferred customer object
       preferredCustomer1.setNumber(25);
       preferredCustomer1.setAddress("The North Pole");
       
       // display the preferred customer object
       displayPreferredCustomer(preferredCustomer1);
       
       System.out.println("Thank you, Orlando Marin!");
    }
        
    
    // method to create a Customer
    public static Customer makeCustomer()
    {
        String name, address, phoneNumber;
        int customerNumber;
        boolean mailingList;
        
        // create a scanner object to read user input
        Scanner keyboard = new Scanner(System.in);
        
        // ask user for customer information
        System.out.println("What is the customer's name?");
        name = keyboard.nextLine();
        
        System.out.println("What is the customer's address?");
        address = keyboard.nextLine();
        
        System.out.println("What is the customer's phone number (numbers only)?");
        phoneNumber = keyboard.nextLine();
        
        System.out.println("What is the customer's loyalty number?");
        customerNumber = keyboard.nextInt();
        
        System.out.println("Does the customer wish to be on the mailing list? If yes, answer 'true', and if no, answer 'false'.");
        mailingList = keyboard.nextBoolean();
        
        Customer newCustomer = new Customer(name, address, phoneNumber, customerNumber, mailingList);
        
        return newCustomer;
    }
    
    // method to display customer info
    public static void displayCustomer(Customer object)
    {
        System.out.printf("\nCustomer Information\nName: %s\nAddress: %s\nPhone number: %s\nLoyalty Number: %d\nCustomer on mailing list: %b\n\n", 
                object.getName(), object.getAddress(), 
                object.getPhoneNumber(), object.getCustomerNumber(), 
                object.getMailingList());
    }
    
    // method to create a Preferred Customer
    public static PreferredCustomer makePreferredCustomer()
    {
        String name, address, phoneNumber;
        int customerNumber;
        boolean mailingList;
        double purchaseAmount;
        
        // create a scanner object to read user input
        Scanner keyboard = new Scanner(System.in);
        
        // ask user for customer information
        System.out.println("What is the preferred customer's name?");
        name = keyboard.nextLine();
        
        System.out.println("What is the preferred customer's address?");
        address = keyboard.nextLine();
        
        System.out.println("What is the preferred customer's phone number (numbers only)?");
        phoneNumber = keyboard.nextLine();
        
        System.out.println("What is the preferred customer's loyalty number?");
        customerNumber = keyboard.nextInt();
        
        System.out.println("Does the preferred customer wish to be on the mailing list? If yes, answer 'true', and if no, answer 'false'.");
        mailingList = keyboard.nextBoolean();
        
        System.out.println("What is the preferred customers purchase amount? Pleae enter numbers and decimal points only.");
        purchaseAmount = keyboard.nextDouble();
        
        PreferredCustomer newPreferredCustomer = new PreferredCustomer(name, address, phoneNumber, customerNumber, mailingList, purchaseAmount);
        
        return newPreferredCustomer;
    }
    
    // method to display Preferred Customer Info
    public static void displayPreferredCustomer(PreferredCustomer object)
    {
        System.out.printf("\nPreferred Customer Information\nName: %s\nAddress: %s\nPhone number: %s\nLoyalty Number: %d\nCustomer on mailing list: %b\nPurchase Amount: $%,.2f\nDiscount Percentage: %.1f\n\n", 
                object.getName(), object.getAddress(), 
                object.getPhoneNumber(), object.getCustomerNumber(), 
                object.getMailingList(), object.getPurchaseAmount(),
                    object.getDiscountPercentage());
    }
}
