package com.books.service;

import com.books.controller.entity.Book;
import com.books.dao.entity.BookDAOEntity;
import com.books.dao.repository.BookRepository;
import com.books.mapper.MapperManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BooksServiceImpl implements BookService {


    @Autowired
    BookRepository bookRepository;


    @Autowired
    MapperManager mapperManager;



    @Override
    public void save(Book book) {

        bookRepository.save(mapperManager.map(book, BookDAOEntity.class));

    }

    @Override
    public List<Book> getAll() {
        List<BookDAOEntity> bookDAOEntities = new ArrayList<>();
        bookRepository.findAll().forEach(bookDAOEntities::add);
        List<Book> books = new ArrayList<>();
        for(BookDAOEntity bookDAOEntity : bookDAOEntities){
            Book book = mapperManager.map(bookDAOEntity, Book.class);
            books.add(book);
        }


        return books;
    }

    @Override
    public Book getById(Integer id) {
        return mapperManager.map(bookRepository.getById(id), Book.class);
    }
}
