package com.book.store.controller;

import com.book.store.controller.entity.Book;
import com.book.store.controller.entity.BookRequest;
import com.book.store.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/bookService")
public class BookController {


    @Autowired
    BookService bookService;

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> getBooks() {
        return bookService.getAll().stream().collect(Collectors.toMap(Book::getName, Book::getAuthor));

    }


    @RequestMapping(value = "/book/{id}")
    @ResponseBody
    public Book getByName(@PathVariable Integer id) {
        return bookService.getById(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    public void save(@RequestBody Book bookRequest) {
        bookService.save(bookRequest);

    }
}
