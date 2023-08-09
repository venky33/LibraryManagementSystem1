package com.lms.serviceimpl;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.dto.BookDTO;
import com.lms.entity.Book;
import com.lms.repository.BookRepository;
import com.lms.service.BookService;
import com.lms.util.BookConverter;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	BookRepository bookRepository;

	@Autowired
	BookConverter bookConverter;

	@Override
	public BookDTO addBook(Book book) {
		Book b=bookRepository.save(book);
		return bookConverter.convertToBookDTO(b);
	}

	@Override
	public List<BookDTO> getAllBooks() {
	List<Book>books=bookRepository.findAll();
	
	//List of DTO type
	List<BookDTO> dtoList=new ArrayList<>();
	for(Book bo:books)
	{
		dtoList.add(bookConverter.convertToBookDTO(bo));
	}
		return dtoList;
	}

	@Override
	public BookDTO getBookById(int id) {
		Book book=bookRepository.findById(id).get();
		return bookConverter.convertToBookDTO(book);
	}

	@Override
	public BookDTO updateBook(int id, Book book) {
		Book b=bookRepository.findById(id).get();
		b.setBookName(book.getBookName());
		b.setAuthor(book.getAuthor());
		b.setPublisher(book.getPublisher());
		Book bo=bookRepository.save(b);
		return bookConverter.convertToBookDTO(bo);
	}

	@Override
	public String deleteBook(int id) {
		bookRepository.deleteById(id);
		
		return "Book details got deleted successfuly";
	}
	

}
