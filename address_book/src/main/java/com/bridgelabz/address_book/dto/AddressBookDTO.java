package com.bridgelabz.address_book.dto;

public class AddressBookDTO 
{
    public String firstName;
    public String lastName;    
    public String city;
    public long phoneNum;

    public AddressBookDTO(String firstName, String lastName, String city, long phoneNum) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "ResponseDTO [city=" + city + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNum="
                + phoneNum + "]";
    }
    
}
