package com.htp.controller;

import com.htp.dao.CustomerDao;
import com.htp.domain.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    CustomerDao customerDao;

    public CustomerController(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }


    @GetMapping()
    public ResponseEntity<List<Customer>> findCustomer() {
        return new ResponseEntity(customerDao.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{customer_id}/firstAddress")
    public ResponseEntity<String> findFirstAddressCustomerById(@PathVariable("customer_id") Long customerId) {
        return new ResponseEntity(customerDao.findOne(customerId).getAddress_list_one(), HttpStatus.OK);
    }

    @GetMapping("/{customer_id}/secondAddress")
    public ResponseEntity<String> findSecondAddressCustomerById(@PathVariable("customer_id") Long customerId) {
        return new ResponseEntity(customerDao.findOne(customerId).getAddress_list_two(), HttpStatus.OK);
    }
}
