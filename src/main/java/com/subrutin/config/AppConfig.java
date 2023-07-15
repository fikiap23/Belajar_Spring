package com.subrutin.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.subrutin.domain.Author;
import com.subrutin.domain.Book;
import com.subrutin.repository.BookRepository;
import com.subrutin.repository.impl.BookRepositoryImpl;
import com.subrutin.service.BookService;
import com.subrutin.service.impl.BookServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean
	public Author author () {
		return new Author(1L , -16401L,"Fiki Aprian");
	}
	
	@Bean
	public Book book1 (Author author) {
		Book book = new Book();
		book.setId(1L);
		book.setTitle("Coding bro");
		book.setDescription("Buku Tentang coding seru");
		book.setAuthor(author);
		return book;
	}
	
	@Bean
	public Book book2 (Author author) {
		Book book = new Book();
		book.setId(2L);
		book.setTitle("Coding bro v2");
		book.setDescription("Buku Tentang coding seru v2");
		book.setAuthor(author);
		return book;
	}
	
	@Bean
	public BookRepository bookRepository(Book book1, Book book2) {
		Map<Long, Book> bookMap = new HashMap<>();
		bookMap.put(1L, book1);
		bookMap.put(2L, book2);
		
		BookRepositoryImpl bookRepository = new BookRepositoryImpl();
		bookRepository.setBookMap(bookMap);
		return bookRepository;
	}
	
	@Bean
	public BookService bookService(BookRepository bookRepository) {
		return new BookServiceImpl(bookRepository);
	}

}
