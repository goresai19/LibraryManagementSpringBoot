package com.LibrarySystem.management.Dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.LibrarySystem.management.Entity.Books;
import com.LibrarySystem.management.Repository.BookRepository;
import com.LibrarySystem.management.Utils.DateUtil;

@Repository
public class BookDao {
   @Autowired
   BookRepository bookRepo;
  
public BookDao(BookRepository bookRepo) {
	super();
	this.bookRepo = bookRepo;
}

    public Books saveBook(Books book) {
    	Books addedBook= bookRepo.save(new Books(book.getBookId(),book.getTitle(),book.getTitle(),book.getBorrowedDate(),DateUtil.calculateReturendDate(book.getBorrowedDate())));
    	return addedBook;
    }
    
    public List<Books> getAllBooks(){
    	List<Books> bookList= bookRepo.findAll();
    	return bookList;
    }
    
 
   
}
