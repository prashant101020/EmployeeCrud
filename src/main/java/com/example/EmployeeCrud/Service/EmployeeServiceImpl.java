package com.example.EmployeeCrud.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeCrud.Entities.Employee;
import com.example.EmployeeCrud.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository repo;
	@Override
	public Employee addEmp(Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
//		return emp;
	}

	@Override
	public String deleteEmp(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "Deleted... Employee with "+id;
	}

	@Override
	public Employee updateEmp(Employee emp) {
		// TODO Auto-generated method stub
		if(repo.existsById(emp.getId())) {
			return repo.save(emp);
		}
		return null;
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll() ;
//		return null;
	}

}
