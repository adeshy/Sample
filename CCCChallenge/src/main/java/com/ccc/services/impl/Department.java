package com.ccc.services.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.ccc.services.Employee;

public class Department implements Employee {

	private List<Employee> employees = new ArrayList<Employee>();

	public Department() {
		super();
	}

	public BigDecimal getAllocation() {
		BigDecimal totalAllocation = BigDecimal.ZERO;
		for (Employee e : employees) {
			totalAllocation = totalAllocation.add(e.getAllocation());
		}
		return totalAllocation;
	}

	public void add(Employee employee) {
		employees.add(employee);
	}

	public void remove(Employee employee) {
		employees.remove(employee);
	}

}
