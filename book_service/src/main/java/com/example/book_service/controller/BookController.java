package com.example.book_service.controller;

import com.example.book_service.dao.BookDAO;
import com.example.book_service.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookDAO dao;

    @GetMapping("/book/list")
    public List<Book> list(){
        return dao.findAll();
    }
}
