package com.LibrarySystem.management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LibrarySystem.management.Entity.Books;

@Repository
public interface BookRepository extends JpaRepository<Books,Integer>{

}
