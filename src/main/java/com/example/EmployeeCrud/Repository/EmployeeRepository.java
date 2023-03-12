package com.example.EmployeeCrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeCrud.Entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
