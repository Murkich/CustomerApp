package com.htp.dao;

import com.htp.domain.Customer;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CustomerRepository implements CustomerDao {


    private EntityManager entityManager;

    public CustomerRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Customer findOne(Long customerId) {
        return entityManager.find(Customer.class, customerId);
    }

    public List<Customer> findAll(){
        return entityManager.createQuery("select c from Customer c").getResultList();
    }

    public Customer findById(@Param("id") long id){
        return (Customer) entityManager.createQuery("select c from Customer c where c.id = :id").getResultList().stream().findFirst().orElse(new Customer());
    }


}


