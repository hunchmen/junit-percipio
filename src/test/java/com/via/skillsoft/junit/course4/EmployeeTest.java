/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.skillsoft.junit.course4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

/**
 * 
 * @author via
 * 
 * @date 24 Oct 2022
 * 
 * @apiNote Running tests repeatedly
 */
class EmployeeTest {

    static Employee employee;
    static double salary;

    @BeforeAll
    static void initEmployee() {
        salary = 45000;
        employee = new Employee("Brian", "Alford", 1011, 'M', "Tester", salary,
                "Contract");
    }

    @RepeatedTest(5)
    @DisplayName("Salary Update")
    void salaryUpdateTest() {

        double salaryIncrement = 2000.0;
        employee.adjustSalary(salaryIncrement);
        salary += salaryIncrement;

        assertEquals(salary, employee.getSalary(), "Test salary updates");
    }

}
