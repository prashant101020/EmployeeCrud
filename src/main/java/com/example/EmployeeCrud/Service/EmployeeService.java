package com.example.EmployeeCrud.Service;

import java.util.ArrayList;
import java.util.List;

import com.example.EmployeeCrud.Entities.Employee;

public interface EmployeeService {
 public Employee addEmp(Employee emp);
 public String deleteEmp(int id);
 public Employee updateEmp(Employee emp);
 public List<Employee> getAll();
}
