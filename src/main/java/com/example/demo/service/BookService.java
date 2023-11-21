package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Books;
import com.example.demo.repository.BookRepository;


@Service
public class BookService {
	@Autowired
	 BookRepository repository;

	public void save(Books books) {
		repository.save(books);
		
	}

	public List<Books> getAllBooks() {
		
		return repository.findAll();
	}

	public Books getBookById(int bookid) {
		
		return repository.findById(bookid).get();
	}

	public void update(Books book,int bookid) {
		repository.save(book);
		
	}

	public void delete(int bookid) {
		
		 repository.deleteById(bookid);;
	}
	

}
