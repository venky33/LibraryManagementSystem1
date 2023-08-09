package com.lms.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.entity.Book;




	public interface BookRepository extends JpaRepository<Book,Integer> 
	{
		//List<Book> findByBook(String Book);  //select * from where address = ?
		//List<Book> findByNameAndBook(String name, String Book);


}
