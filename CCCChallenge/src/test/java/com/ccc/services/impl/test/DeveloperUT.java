package com.ccc.services.impl.test;

import java.math.BigDecimal;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import com.ccc.services.impl.Developer;

public class DeveloperUT {
	
	public Developer classUnderTest;
	
	@Test
	public void testConstructor_shouldReturnNewObject() {
		classUnderTest = new Developer();
		Assert.assertNotNull(classUnderTest);
	}
	
	@Test
	public void getAllocation_shouldReturn_1000() {
		BigDecimal expenseAllocation = new BigDecimal("1000");
		classUnderTest = new Developer();
		BigDecimal response = classUnderTest.getAllocation();
		Assert.assertThat(response, Is.is(expenseAllocation));
	}
	
	

}
