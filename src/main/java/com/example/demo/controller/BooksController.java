package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Books;
import com.example.demo.service.BookService;



@RestController
public class BooksController {
	
	@Autowired
	 BookService service;
	
	@PostMapping("/save")
	public int save(@RequestBody Books books) {
		service.save(books);
		return books.getBookid();
	}
	@GetMapping("/books")
	public List<Books>getAllBooks()
	{
		return service.getAllBooks();
	}
	@GetMapping("/book/{bookid}")
	public Books getBookById(@PathVariable("bookid") int bookid )
	{
		return service.getBookById(bookid);
	}
	@PutMapping("/update")
    public int update(@RequestBody Books book) {
    	service.save(book );
    	return book.getBookid();
    }
	@DeleteMapping("/delete/{bookid}")
	public String  delete(@PathVariable("bookid") int bookid)
	{
		 service.delete(bookid);
		 return "deleted successfully";
	}
}
