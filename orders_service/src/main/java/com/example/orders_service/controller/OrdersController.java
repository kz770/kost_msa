package com.example.orders_service.controller;

import com.example.orders_service.dao.OrdersDAO;
import com.example.orders_service.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrdersController {

    @Autowired
    OrdersDAO dao;

    @GetMapping("/orders/list")
    public List<Orders> orderslist(){
        return dao.findAll();
    }

    @PostMapping("/order/list")
    public String insertSubmit(Orders orders){
        dao.save(orders);
        return "redirect:/order/list";
    }
}
