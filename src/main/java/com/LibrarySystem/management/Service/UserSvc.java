package com.LibrarySystem.management.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LibrarySystem.management.Dao.UserDao;
import com.LibrarySystem.management.Entity.Users;

@Service
public class UserSvc {
 
	@Autowired
	UserDao userDao;
	
	
   public Users saveUser(Users user) {
	   return userDao.addUser(user);
   }
   
   public List<Users> getAllUsers() {
	   return userDao.getAllUsers();
   }
}
