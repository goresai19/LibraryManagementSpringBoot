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
  
  @Column(name="name")
  private String name;
  
  @Column(name="adress")
  private String address;
  
  @Column(name="mobileNumber",length=10)
  private String mobileNumber;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getMobileNumber() {
	return mobileNumber;
}

public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}

public Users(int id, String name, String address, String mobileNumber) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.mobileNumber = mobileNumber;
}
  
  
}
