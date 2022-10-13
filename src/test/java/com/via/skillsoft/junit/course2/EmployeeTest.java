package com.via.skillsoft.junit.course2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
	
	static Employee employee;
	
	@BeforeAll
	static void initEmployee() {
		employee = new Employee("Amy", "Cruz", 1001, 'F', "Developer", 50000, "Permanent");
	}
	
	@Test
	void assertTest() {
		employee.adjustSalary(5000);
		assertEquals(55000, employee.getSalary());
	}
	
}
