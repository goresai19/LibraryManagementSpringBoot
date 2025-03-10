package com.LibrarySystem.management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.LibrarySystem.management.Entity.Users;
import com.LibrarySystem.management.Service.UserSvc;

@Controller
@RequestMapping("/user")
public class UserController {
    
	@Autowired
	UserSvc userSvc;
	
	@PostMapping("/addUser")
    public ResponseEntity<Users> addUser(@RequestBody Users user){
    	return ResponseEntity.ok(userSvc.saveUser(user));
    	
    }
    
	
	@GetMapping("/getAllUsers")
    public ResponseEntity<List<Users>> getAllUsers(){
    	return ResponseEntity.ok(userSvc.getAllUsers());
    }
}
