package com.ccc.services.impl;

import java.math.BigDecimal;

import com.ccc.services.Employee;

public class QATester implements Employee{
	private final static BigDecimal allocation = new BigDecimal("500");
	public QATester() {
		super();
	}
	public BigDecimal getAllocation() {
		return QATester.allocation;
	}
	public void add(Employee employee)  {
		// No Implementation In some business cases you could throw an exception
		
	}
	public void remove(Employee employee) {
		// No Implementation In some business cases you could throw an exception
		
	}
}
