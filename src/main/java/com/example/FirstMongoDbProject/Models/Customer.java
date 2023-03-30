package com.example.FirstMongoDbProject.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "customer")
public class Customer {
    @Id
    private int customerId;
    private String name;
    private int age;
    private String mobileNo;
    private String emailId;
    private String city;

    public Customer() {
    }

    public Customer(int customerId, String name, int age,
                    String mobileNo, String emailId, String city) {
        this.customerId = customerId;
        this.name = name;
        this.age = age;
        this.mobileNo = mobileNo;
        this.emailId = emailId;
        this.city = city;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

/*
*
* type mongod in cmd to start the server
*
* */
