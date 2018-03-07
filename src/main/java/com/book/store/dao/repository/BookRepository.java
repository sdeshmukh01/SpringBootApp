package com.book.store.dao.repository;

import com.book.store.dao.entity.BookDAOEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<BookDAOEntity, Integer> {

    BookDAOEntity getById(Integer id);
}
