/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personcustomerpreferredcustomerdemo;

/**
 *
 * @author orlandomarin
 */
public class Customer extends Person
{
    // instance fields
    private int customerNumber;
    private boolean mailingList;
    
    // constructors
    /* constructor that accepts the name, address, and phone number from the Person class,
       and accepts the int customerNumber and boolean customerMailing List.
       If the mailingList is true, the customer wishes to be on the mailing list. If the
       mailing list value is false, the customer does not want to be on the mailing list.
    */
    public Customer(String personName, String personAddress, String personPhoneNumber, int loyaltyNumber, boolean customerMailingList)
    {
        super(personName, personAddress, personPhoneNumber);
        customerNumber = loyaltyNumber;
        mailingList = customerMailingList;
    }
    
    // methods
    // method that sets the customer number
    public void setNumber(int loyaltyNumber)
    {
        customerNumber = loyaltyNumber;
    }
    
    // method to set whether or not the customer is on the mailing list (boolean)
    public void setMailingList(boolean customerMailingList)
    {
        mailingList = customerMailingList;
    }
    
    // method that returns the int customer
    public int getCustomerNumber()
    {
        return customerNumber;
    }
    
    // method that returns a boolean that shows whether or not the customer is on the mailing list
    public boolean getMailingList()
    {
        return mailingList;
    }   
}
