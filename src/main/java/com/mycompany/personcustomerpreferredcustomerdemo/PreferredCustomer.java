/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personcustomerpreferredcustomerdemo;

/**
 *
 * @author orlandomarin
 */
public class PreferredCustomer extends Customer
{
    /*
    Design a class named PreferredCustomer, which extends the Customer class. 
    The PreferredCustomer class should have fields for the amount of the
    customer's purchases and the customer's discount level. Write one or more
    constructors and the appropriate mutator and accessor methods for the 
    class's fields. Demonstrate the class in a simple program.
    */
    
    // INSTANCE FIELDS 
    private double purchaseAmount;
    private double discountPercentage;
    
    // CONSTRUCTORS
    public PreferredCustomer(String personName, String personAddress, String personPhoneNumber, int loyaltyNumber, boolean customerMailingList, double customerPurchaseAmount)
    {
        super(personName, personAddress, personPhoneNumber, loyaltyNumber, customerMailingList);
        purchaseAmount = customerPurchaseAmount;
    }
    
    // METHODS
    // method to set purchase amount
    public void setPurchaseAmount (double customerPurchaseAmount)
    {
        purchaseAmount = customerPurchaseAmount;
    }
    
    // method to get purchase amount
    public double getPurchaseAmount ()
    {
        return purchaseAmount;
    }
    
    // method to get discount percentage
    public double getDiscountPercentage()
    {
        if (purchaseAmount >= 2000.00)
        {
            discountPercentage = 10.0;
        }
        else if (purchaseAmount >= 1500.00)
        {
            discountPercentage = 7.0;
        }
        else if (purchaseAmount >= 1000.00)
        {
            discountPercentage = 6.0;
        }
        else if (purchaseAmount >= 500.00)
        {
            discountPercentage = 5.0;
        }
        else discountPercentage = 0.0;
              
        return discountPercentage;
    }   
}
