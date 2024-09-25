package com.example.customer_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="customer")
public class Customer {
    @Id
    private int custid;
    private String name;
    private String address;
    private String phone;
}
