/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.personcustomerpreferredcustomerdemo;

/**
 *
 * @author orlandomarin
 */
public class Person 
{
    /*
    Design a class named Person with fields for holding a person's name,
    address, and telephone number. Write one or more constructors and the
    appropriate mutator and accessor methods for the class's fields.
    */
    
    // instance fields
    private String name;
    private String address;
    private String phoneNumber;
    
    /* 
    Person constructor that accepts 3 String arguments: personName, 
    personAddress, and personNumber
    */
    public Person(String personName, String personAddress, String personPhoneNumber)
    {
        name = personName;
        address = personAddress;
        phoneNumber = personPhoneNumber;
    }
    
    // METHODS
    // method to set name
    public void setName(String personName)
    {
        name = personName;
    }
    
    // method to set address
    public void setAddress(String personAddress)
    {
        address = personAddress;
    }
    
    // method to set phone number
    public void setPhoneNumber(String personPhoneNumber)
    {
        phoneNumber = personPhoneNumber;
    }
    
    // method to get name
    public String getName()
    {
        return name;
    }
    
    // method to get address
    public String getAddress()
    {
        return address;
    }
    
    // method to get phone number
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
}
