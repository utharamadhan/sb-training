package com.rpramadhan.sbtraining.repository;

import org.springframework.data.repository.CrudRepository;

import com.rpramadhan.sbtraining.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
