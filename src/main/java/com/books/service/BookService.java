package com.books.service;

import com.books.controller.entity.Book;

import java.util.List;

public interface BookService {


    public void save(Book book);

    public List<Book> getAll();

    public Book getById(Integer id);
}
