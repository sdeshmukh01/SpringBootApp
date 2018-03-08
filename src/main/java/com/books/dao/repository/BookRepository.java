package com.books.dao.repository;

import com.books.dao.entity.BookDAOEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<BookDAOEntity, Integer> {

    BookDAOEntity getById(Integer id);
}
