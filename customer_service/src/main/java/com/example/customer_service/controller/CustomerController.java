package com.example.customer_service.controller;

import com.example.customer_service.dao.CustomerDAO;
import com.example.customer_service.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerDAO dao;

    @GetMapping("/customer/list")
    public List<Customer> list(){
        return dao.findAll();
    }
}
