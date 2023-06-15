package com.example.SpringBootDemo.Model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employee {
	@GeneratedValue
	@Id
	@Column
	public int empId;
	@Column
	public String empName;
	@Column
	public float empSalary;

}