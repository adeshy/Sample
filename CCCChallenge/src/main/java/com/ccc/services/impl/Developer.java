package com.ccc.services.impl;

import java.math.BigDecimal;

import com.ccc.services.Employee;

public class Developer implements Employee{
	
	private final static BigDecimal allocation = new BigDecimal("1000");
	public Developer() {
		super();
	}
	
	public BigDecimal getAllocation() {
		return Developer.allocation;
	}

	public void add(Employee employee)  {
		// N/A. In some business cases you could throw an exception
		
	}
	public void remove(Employee employee) {
		// N/A. In some business cases you could throw an exception
	}
}
