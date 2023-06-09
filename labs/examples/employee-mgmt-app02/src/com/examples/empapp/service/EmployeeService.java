package com.examples.empapp.service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import com.examples.empapp.model.Employee;

public interface EmployeeService {
	public boolean create(Employee emp);

	public boolean update(Employee emp);

	public boolean delete(int empId);

	public Employee get(int empId);

	public List<Employee> getAll();

	public boolean validate(Employee emp, String msg, Predicate<Employee> condition,
			Function<String, Boolean> operation);

	public long getEmployeeCountAgeGreaterThan(Predicate<Employee> condition);

	public List<Integer> getEmployeeIdsAgeGreaterThan(int age);

	public Map<String, Long> getEmployeeCountByDepartment();

	public Map<String, Long> getEmployeeCountByDepartmentOrdered();

	public Map<String, Double> getAvgEmployeeAgeByDept();

	public List<String> getDepartmentsHaveEmployeesMoreThan(int criteria);

	public List<String> getEmployeeNamesStartsWith(String prefix);
}
