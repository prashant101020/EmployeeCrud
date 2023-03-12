package com.example.EmployeeCrud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeCrud.Entities.Employee;
import com.example.EmployeeCrud.Service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService serv;
	
	@GetMapping("/view/all")
	public ResponseEntity<List<Employee>> viewEmployee(){
		List<Employee> list=serv.getAll();
		return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee emp){
		Employee emp1=serv.addEmp(emp);
		return new ResponseEntity<Employee>(emp1,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") int id){
		String ss=serv.deleteEmp(id);
		return new ResponseEntity<String>(ss,HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp){
		Employee emp2=serv.updateEmp(emp);
	return new ResponseEntity<Employee> (emp2,HttpStatus.ACCEPTED);
	}
}
