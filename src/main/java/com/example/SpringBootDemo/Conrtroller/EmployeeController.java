package com.example.SpringBootDemo.Conrtroller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootDemo.Model.Employee;
import com.example.SpringBootDemo.Service.EmployeeService;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	public EmployeeController() {
		
	}
	@Autowired
	EmployeeService empservice;
	@GetMapping("/getOneEmployee/{id}")
	public Optional<Employee> getOneEmployee(@PathVariable ("id") int id) {
		return empservice.getOneEmployee(id);
	}
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees(){
		return empservice.getAllEmployees();
	}
	@PostMapping("/saveOneEmployee")
	public Employee saveOneEmployee(@RequestBody Employee emp) {
		return empservice.saveOneEmployee(emp);
	}
	@PostMapping("/saveAllEmployees")
	public List<Employee> saveAllEmployees(@RequestBody List<Employee> emps){
		return empservice.saveAllEmployees(emps);
	}
	@PutMapping("/updateOneEmployee")
	public void updateOneEmployee(@PathVariable int id ,@RequestBody Employee emp) {
		 updateOneEmployee(id,emp);
	}
	@DeleteMapping("/deleteOneEmployee/{id}")
	public void deleteOneEmployee(@PathVariable ("id") int id) {
		empservice.deleteOneEmployee(id);
	}
	@DeleteMapping("/deleteAllEmployees")
	public void deleteAllEmployees() {
		 empservice.deleteAllEmployees();
	}

}