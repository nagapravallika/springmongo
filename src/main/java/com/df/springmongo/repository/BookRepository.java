package com.df.springmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.df.springmongo.amodel.Book;

public interface BookRepository extends MongoRepository<Book, String>{

}
