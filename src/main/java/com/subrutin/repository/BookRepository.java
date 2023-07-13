package com.subrutin.repository;

import com.subrutin.domain.Book;

public interface BookRepository {
	
	public Book findBookById(Long id);

}