package com.example.EmployeeCrud.Entities;

//import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class Employee {
@Id
int id;

String FirstName;

String LastName;

int Salary;
public Employee() {
	
}
public Employee(int id, String firstName, String lastName, int salary) {
	super();
	this.id = id;
	FirstName = firstName;
	LastName = lastName;
	Salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public int getSalary() {
	return Salary;
}
public void setSalary(int salary) {
	Salary = salary;
}
}
