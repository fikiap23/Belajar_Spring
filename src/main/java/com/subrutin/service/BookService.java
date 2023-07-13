package com.subrutin.service;

import com.subrutin.dto.BookDetailDTO;

public interface BookService {
	
	public BookDetailDTO findBookDetailById(Long bookId);

}