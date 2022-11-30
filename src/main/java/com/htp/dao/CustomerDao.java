package com.htp.dao;

import com.htp.domain.Customer;

import java.util.List;

public interface CustomerDao {

    Customer findOne(Long customerId);
    List<Customer> findAll();
}
