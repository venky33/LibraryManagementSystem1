package com.lms.service;

import java.util.List;

//import org.springframework.stereotype.Service;

import com.lms.dto.BookDTO;
import com.lms.entity.Book;

public interface BookService {
	BookDTO addBook(Book book);				// Adding book Details
	
	List<BookDTO>getAllBooks();				// Display List Of All book Details

	BookDTO getBookById(int id);			// Getting all book Details 

	BookDTO	updateBook(int id, Book book);	// delete book details 

	String deleteBook(int id);				//update book details

}

