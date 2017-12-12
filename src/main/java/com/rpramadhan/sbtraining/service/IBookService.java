package com.rpramadhan.sbtraining.service;

import com.rpramadhan.sbtraining.model.Book;

public interface IBookService {
	
	public Book findById(Long id);
	
	public void saveOrUpdate(Book book) throws Exception;

}
