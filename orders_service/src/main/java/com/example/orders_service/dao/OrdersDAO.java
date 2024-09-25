package com.example.orders_service.dao;

import com.example.orders_service.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersDAO extends JpaRepository<Orders, Integer> {
}
