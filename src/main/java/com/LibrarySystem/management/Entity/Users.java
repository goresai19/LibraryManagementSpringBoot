package com.LibrarySystem.management.Entity;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Users")
public class Users {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;
  
  @Column(name="name",nullable=false)
  private String name;
  
  @Column(name="adress",nullable=false)
  private String address;
  
  @Column(name="mobileNumber",nullable=false,length=10)
  private String mobileNumber;
  
  
}
