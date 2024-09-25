package com.example.orders_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name="orders")
public class Orders {
    @Id
    private int orderid;
    private int custid;
    private int bookid;
    private int saleprice;
    private LocalDate orderdate;
}
