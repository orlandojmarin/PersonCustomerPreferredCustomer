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
        // create a customer object
       Customer customer1 = makeCustomer();
       
       // display the customer object
       System.out.println();
       displayCustomer(customer1);
       System.out.println();
       
       System.out.println("Changing the customer's name and displaying their updated information.");
       System.out.println();
       
       // change a customer field and display the new customer object
       customer1.setName("Orlando Marin");
       displayCustomer(customer1);
       System.out.println();
       
       // create a preferred customer object
       PreferredCustomer preferredCustomer1 = makePreferredCustomer();
       
       // display the preferred customer object
       System.out.println();
       displayPreferredCustomer(preferredCustomer1);
       System.out.println();
       
       System.out.println();
       System.out.println("Changing the preferred customer's account number and address, and displaying their updated information.");
       System.out.println();
       
       // change 2 preferred customer fields and display the new preferred customer object
       preferredCustomer1.setNumber(99);
       preferredCustomer1.setAddress("123 Drury Lane");
       
       // display the preferred customer object
       displayPreferredCustomer(preferredCustomer1);
       System.out.println();
    }
        
    
    // method to create a Customer
    public static Customer makeCustomer()
    {
        String name, address, phoneNumber;
        int custNumber;
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
        
        System.out.println("What is the customer's account number?");
        custNumber = keyboard.nextInt();
        
        System.out.println("Does the customer wish to be on the mailing list? If yes, answer 'true', and if no, answer 'false'.");
        mailingList = keyboard.nextBoolean();
        
        Customer newCustomer = new Customer(name, address, phoneNumber, custNumber, mailingList);
        
        return newCustomer;
    }
    
    // method to display customer info
    public static void displayCustomer(Customer object)
    {
        System.out.printf("Customer Information\nName: %s\nAddress: %s\nPhone number: %s\nAccount Number: %d\nCustomer on mailing list: %b\n", 
                object.getName(), object.getAddress(), 
                object.getPhoneNumber(), object.getNumber(), 
                object.getMailingList());
    }
    
    // method to create a Preferred Customer
    public static PreferredCustomer makePreferredCustomer()
    {
        String name, address, phoneNumber;
        int custNumber;
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
        
        System.out.println("What is the preferred customer's account number?");
        custNumber = keyboard.nextInt();
        
        System.out.println("Does the preferred customer wish to be on the mailing list? If yes, answer 'true', and if no, answer 'false'.");
        mailingList = keyboard.nextBoolean();
        
        System.out.println("What is the preferred customers purchase amount? Pleae enter numbers and decimal points only.");
        purchaseAmount = keyboard.nextDouble();
        
        PreferredCustomer newPreferredCustomer = new PreferredCustomer(name, address, phoneNumber, custNumber, mailingList, purchaseAmount);
        
        return newPreferredCustomer;
    }
    
    // method to display Preferred Customer Info
    public static void displayPreferredCustomer(PreferredCustomer object)
    {
        System.out.printf("Preferred Customer Information\nName: %s\nAddress: %s\nPhone number: %s\nAccount Number: %d\nCustomer on mailing list: %b\nPurchase Amount: $%,.2f\nDiscount Percentage: %.2f", 
                object.getName(), object.getAddress(), 
                object.getPhoneNumber(), object.getNumber(), 
                object.getMailingList(), object.getPurchaseAmount(),
                    object.getDiscountPercentage());
    }
}
