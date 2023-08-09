package com.lms.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lms.dto.BookDTO;
import com.lms.entity.Book;
import com.lms.service.BookService;
import com.lms.util.BookConverter;

@RestController

public class BookController 
{
	@Autowired
	BookService bookService ;
	
	@Autowired
	BookConverter bookConverter;
	
	@PostMapping("/addBooks")
	ResponseEntity<BookDTO> addBook(@RequestBody @Valid BookDTO bookDTO)
	{ 
		
		Book book=bookConverter.convertToBook(bookDTO);
		return new ResponseEntity<BookDTO>(bookService.addBook(book),HttpStatus.CREATED);
	}
	@GetMapping("/getBookById/{id}")
	ResponseEntity<BookDTO> getBookById(@PathVariable int id)
	{
		return new ResponseEntity<BookDTO>(bookService.getBookById(id),HttpStatus.FOUND);
	}
	
	@GetMapping("/getAllBook")
	ResponseEntity<List<BookDTO>> getBooks()
	{
		return new ResponseEntity<List<BookDTO>>(bookService.getAllBooks(),HttpStatus.FOUND);
	}
	@PutMapping("/updateBook/{id}")
	ResponseEntity<BookDTO> updateBook(@PathVariable int id,@RequestBody BookDTO bookDTO)
	{
		Book book=bookConverter.convertToBook(bookDTO);
		return new ResponseEntity<BookDTO>(bookService.updateBook(id, book),HttpStatus.OK);
		
		
	}
	
	@DeleteMapping("/deleteBookById/{id}")
	ResponseEntity<String> deleteById(@PathVariable int id)
	{
		return new ResponseEntity<String>(bookService.deleteBook(id),HttpStatus.OK);
	}
	
}
