package com.subrutin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.subrutin.domain.Book;
import com.subrutin.dto.BookDetailDTO;
import com.subrutin.repository.BookRepository;
import com.subrutin.service.BookService;

@Service("bookService")
public class BookServiceImpl implements BookService{

	private BookRepository bookRepository;

	
	@Autowired
	public BookServiceImpl(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@Override
	public BookDetailDTO findBookDetailById(Long bookId) {
		Book book = bookRepository.findBookById(bookId);
		BookDetailDTO dto = new BookDetailDTO();
		dto.setBookId(book.getId());
		dto.setAuthorName(book.getAuthor().getName());
		dto.setBookTitle(book.getTitle());
		dto.setBookDescription(book.getDescription());
		return dto;
	}

	
	
	
	
}