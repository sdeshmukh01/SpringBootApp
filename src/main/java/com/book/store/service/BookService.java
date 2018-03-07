package com.book.store.service;

import com.book.store.controller.entity.Book;

import java.util.List;

public interface BookService {


    public void save(Book book);

    public List<Book> getAll();

    public Book getById(Integer id);
}
