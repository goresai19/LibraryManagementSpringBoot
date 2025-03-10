package com.LibrarySystem.management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LibrarySystem.management.Entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {

}
