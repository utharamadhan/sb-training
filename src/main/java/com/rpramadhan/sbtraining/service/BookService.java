package com.rpramadhan.sbtraining.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rpramadhan.sbtraining.model.Book;
import com.rpramadhan.sbtraining.repository.BookRepository;

@Component
public class BookService implements IBookService {
	
	@Autowired
	private BookRepository repository;
	
	
	@Override
	public Book findById(Long id) {
		try {
			return repository.findOne(id);
		} catch (Exception ex) {
			return null;
		}
	}

	@Override
	public void saveOrUpdate(Book book) throws Exception {
		if (book.getId() != null && !isExists(book.getId())) {
			throw new Exception("not found");
		}
		repository.save(book);
	}
	
	private Boolean isExists(Long id) {
		return findById(id) != null;
	}
	
}
