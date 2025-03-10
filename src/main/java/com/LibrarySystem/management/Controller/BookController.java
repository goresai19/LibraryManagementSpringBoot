package com.LibrarySystem.management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.LibrarySystem.management.Entity.Books;
import com.LibrarySystem.management.Service.BookSvc;

@Controller
@RequestMapping("/book")
public class BookController {
   @Autowired
   BookSvc bookSvc;
   
   @PostMapping("/addBook")
   public ResponseEntity<Books> addBook(@RequestBody Books book){
	   return ResponseEntity.ok(bookSvc.addBook(book));
   }
   
   
   @GetMapping("/getAllBooks")
   public ResponseEntity<List<Books>> getAllBooks(){
	   return ResponseEntity.ok(bookSvc.getAllBooks());
   }
}
