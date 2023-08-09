package com.lms.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.lms.dto.BookDTO;
import com.lms.entity.Book;

@Component
public class BookConverter {
	public Book convertToBook(BookDTO bookDTO)
	{
		Book book=new Book();
		if (bookDTO!=null)
		{
			BeanUtils.copyProperties(bookDTO, book);
		}
		return book;
		
	}

	//converting entity to DTO
	public BookDTO convertToBookDTO(Book book)
	{
		BookDTO bookDTO=new BookDTO();
		if (book!=null)
		{
			BeanUtils.copyProperties(book, bookDTO);
		}
		return bookDTO;
		
	}
}
