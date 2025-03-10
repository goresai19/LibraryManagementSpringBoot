package com.LibrarySystem.management.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LibrarySystem.management.Dao.BookDao;
import com.LibrarySystem.management.Entity.Books;

@Service
public class BookSvc {

	@Autowired 
	BookDao bookDao;
	
	
	public Books addBook(Books book) {
		return bookDao.saveBook(book);
	}
	
	public List<Books> getAllBooks(){
		return bookDao.getAllBooks();
	}
	
	public Books getBookById(int id) {
		return bookDao.getBookById(id);
	}
}
