package com.java.db;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.java.dto.Employee;

public class EmployeeRepository {
	
	static Map<Integer, Employee> database= new HashMap<>();
	
	static{
		database.put(1, new Employee(1,"kirti", "revature"));
		database.put(2, new Employee(2,"kanika", "revature"));
		database.put(3, new Employee(3,"shruti", "rjt"));
		database.put(4, new Employee(4,"meghna", "revature"));
		database.put(5, new Employee(5,"ravi", "infosys"));
	}
	
	public void createEmployee(Employee employee) {
		database.put(employee.getId(), employee);
	}
	
	public void updateEmployee(Employee employee) {
		database.put(employee.getId(), employee);
	}

	public void deleteEmployee(int id) {
		database.remove(id);
	}
	
	public Employee getEmployee(int id) {
		return database.get(id);
	}
	
	public Collection<Employee> getEmployees() {
		return database.values();
	}
	
}
