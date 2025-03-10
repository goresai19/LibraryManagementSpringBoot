package com.LibrarySystem.management.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.LibrarySystem.management.Entity.Users;
import com.LibrarySystem.management.Repository.UserRepository;

@Repository
public class UserDao {
    @Autowired
    UserRepository userRepo;
    
    
    public Users addUser(Users user) {
       Users addedUser = userRepo.save(user);
       return addedUser;
    }
    
    public List<Users> getAllUsers(){
    	List<Users> allUsers= userRepo.findAll();
    	return allUsers;
    }
    
}
