package com.bridgelabz.address_book.controller;

import com.bridgelabz.address_book.dto.AddressBookDTO;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addressBookService")
public class AddressBookController 
{
    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<String> getAddressBookData() 
    {
        return new ResponseEntity<String>("Get Call is Successfull !!!",HttpStatus.OK);
    }

    @GetMapping("/get/{firstName}")
    public ResponseEntity<String> getAddressBookData(@PathVariable("firstName") String firstName) 
    {
            return new ResponseEntity<String>("Get call is succesfull for First Name: " + firstName, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> addAddressBookData(@RequestBody AddressBookDTO addressbookDTO)
    {
        return new ResponseEntity<String>("Created Address Book Data for:"  + addressbookDTO, HttpStatus.OK);
    }   
        
    @PutMapping("/update")
    public ResponseEntity<String> updateAddressBookData(@RequestBody AddressBookDTO addressbookDTO) 
    {
        return new ResponseEntity<String>("Updated Address Book Data for: " + addressbookDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{firstName}")
    public ResponseEntity<String>deleteAddressBookData(@PathVariable("firstName") String firstName) {
        return new ResponseEntity<String>("Deleted the Address Book Data for: " + firstName, HttpStatus.OK);
    }    
}
