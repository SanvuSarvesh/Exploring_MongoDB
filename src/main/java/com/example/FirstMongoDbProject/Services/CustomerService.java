package com.example.FirstMongoDbProject.Services;

import com.example.FirstMongoDbProject.Models.Customer;
import com.example.FirstMongoDbProject.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public String addCustomer(Customer customer){
        customerRepository.save(customer);
        return "New Customer has been added.";
    }
    public Customer getCustomer(int customerId){
        Customer customer = customerRepository.findCustomerByCustomerId(customerId);
        return customer;
    }

    public String updateCustomer(int customerId, String mobileNo){
        Customer customer = customerRepository.findCustomerByCustomerId(customerId);
        customer.setMobileNo(mobileNo);
        customerRepository.save(customer);
        return "Your mobile number has been updated.";
    }

    public String deleteCustomer(int customerId){
        customerRepository.deleteCustomerByCustomerId(customerId);
        return "Your details has been removed from the system";
    }
}
