package com.df.springmongo.controlller;

//import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.df.springmongo.amodel.Book;
import com.df.springmongo.repository.BookRepository;

@RestController
@RequestMapping("/book")
public class BookController 
{

	@Autowired
	private BookRepository repository;
	
	@PostMapping("/addBook")
	public String saveBook(@RequestBody Book book)
	{
		repository.save(book);
		return "added book with id: ";
		//+ book.getId();
	}
}

