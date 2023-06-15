package com.example.SpringBootDemo.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringBootDemo.Model.Employee;
import com.example.SpringBootDemo.Repository.EmployeeRepo;

@Service
public class EmployeeService {
	public EmployeeService() {
		
	}
	@Autowired
	EmployeeRepo emprepo;
	public Optional<Employee> getOneEmployee(int id) {
		return emprepo.findById(id);
	}
	public List<Employee> getAllEmployees(){
		return emprepo.findAll();
				
	}
	public Employee saveOneEmployee(Employee emp) {
		return emprepo.save(emp);
	}
	public List<Employee> saveAllEmployees(List<Employee> emps){
		return emprepo.saveAll(emps);
	}
//	 public void updateOneEmployee(int id, Employee newData) {
//			
//		 Employee old = emprepo.getById(id);
//		
//		 if(newData.getEmpId()==old.getEmpId())///old data from database
//		 {
//		 Employee updatedData = new Employee();//here default values are there.
//		 updatedData.setEmpId(newData.getEmpId());
//		 if(newData.getEmpName()!=null)
//	 {
//	 updatedData.setEmpName(newData.getEmpName());
//	 }
////		 else
////			 updatedData.setEmpName(old.getEmpName());
////			 
//	 if(newData.getEmpSalary()>0.0f)
//		 {
//		 updatedData.setEmpSalary(newData.getEmpSalary());
//		 }
////		 else
////			 updatedData.setEmpSalary(old.getEmpSalary());
////			 
//		 
//	 
//	  emprepo.save(updatedData);
//		 }
//	  }
	public void deleteOneEmployee(int id) {
	   emprepo.deleteById(id);
	}
	public void deleteAllEmployees() {
		System.out.println("Delete all the Employees");
		emprepo.deleteAll();
	}

}

