package com.example.SpringBootDemo.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootDemo.Model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{



}