package com.example.FirstMongoDbProject.Controllers;

import com.example.FirstMongoDbProject.Models.Customer;
import com.example.FirstMongoDbProject.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @PostMapping("/add_customer")
    public String addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @GetMapping("/get_customer")
    public Customer getCustomer(@RequestParam("id") int customerId){
        return customerService.getCustomer(customerId);
    }

    @PutMapping("/update_details")
    public String updateCustomer(@RequestParam("id") int customerId,
                                 @RequestParam("mobileNo") String mobileNo){
        return customerService.updateCustomer(customerId,mobileNo);
    }

    @DeleteMapping("/delete_customer")
    public String deleteCustomer(@RequestParam("id") int customerId){
        return deleteCustomer(customerId);
    }
}
