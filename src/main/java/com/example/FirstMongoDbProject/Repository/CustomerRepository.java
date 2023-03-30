package com.example.FirstMongoDbProject.Repository;

import com.example.FirstMongoDbProject.Models.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends MongoRepository<Customer,Integer> {
    public Customer findCustomerByCustomerId(int customerId);
    public String deleteCustomerByCustomerId(int customerId);
}
