package com.LibrarySystem.management.Entity;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Books")
public class Books {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private int bookId;

@Column(name="title",nullable=false)
private String title;

@Column(name="status",nullable=false)
private String status;

@Column(name="borrowedDate",nullable=false)
@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
private LocalDate borrowedDate;

@Column(name="returnedDate",nullable=false)
@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
private LocalDate returnedDate;

public int getBookId() {
	return bookId;
}

public void setBookId(int bookId) {
	this.bookId = bookId;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public LocalDate getBorrowedDate() {
	return borrowedDate;
}

public void setBorrowedDate(LocalDate borrowedDate) {
	this.borrowedDate = borrowedDate;
}

public LocalDate getReturnedDate() {
	return returnedDate;
}

public void setReturnedDate(LocalDate returnedDate) {
	this.returnedDate = returnedDate;
}

public Books(int bookId, String title, String status, LocalDate borrowedDate, LocalDate returnedDate) {
	super();
	this.bookId = bookId;
	this.title = title;
	this.status = status;
	this.borrowedDate = borrowedDate;
	this.returnedDate = returnedDate;
}

public Books() {
	super();
}


}
