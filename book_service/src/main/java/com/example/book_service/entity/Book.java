package com.example.book_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="book")
public class Book {
    @Id
    private int bookid;
    private String bookname;
    private int price;
    private String publisher;
}
