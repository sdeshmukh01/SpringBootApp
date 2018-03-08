package com.books.mapper;

import com.books.controller.entity.Book;
import com.books.dao.entity.BookDAOEntity;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.stereotype.Component;


@Component
public class MapperManager {


    private MapperFactory mapperFactory;

    public MapperManager() {
        this.mapperFactory = new DefaultMapperFactory.Builder().build();
        this.mapperFactory.classMap(BookDAOEntity.class, Book.class).
                mapNulls(false).
                mapNullsInReverse(false).
                byDefault().
                register();
    }

    public <S, D> D map(S s, Class<D> type) {
        return this.mapperFactory.getMapperFacade().map(s, type);
    }
}