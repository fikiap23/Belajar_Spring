package com.subrutin.repository.impl;


import java.util.Map;
import com.subrutin.domain.Book;
import com.subrutin.repository.BookRepository;

public class BookRepositoryImpl implements BookRepository {
	
	private Map<Long, Book> bookMap;
	

	@Override
	public Book findBookById(Long id) {
		Book book = bookMap.get(id);
		return book;
	}



	public Map<Long, Book> getBookMap() {
		return bookMap;
	}



	public void setBookMap(Map<Long, Book> bookMap) {
		this.bookMap = bookMap;
	}

}