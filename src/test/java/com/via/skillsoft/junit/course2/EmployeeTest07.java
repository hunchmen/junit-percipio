/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.skillsoft.junit.course2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author via
 * 
 * @date 19 Oct 2022
 * 
 * @title Using assumptions in test case
 */
class EmployeeTest07 {

    static Employee employee;
    static GregorianCalendar gc;

    @BeforeAll
    static void initEmployee() {
        employee = new Employee("Susan", "Forrester", 1005, 'F', "Tech Lead",
                80000, "Permanent");

        gc = new GregorianCalendar();
    }

    @Test
    void assumptionTest() throws InterruptedException {

        System.out.println("Current hour: " + gc.get(Calendar.HOUR_OF_DAY));

        Assumptions.assumeTrue(gc.get(Calendar.HOUR_OF_DAY) < 22);

        employee.adjustSalary(5000);
        assertEquals(85000, employee.getSalary());

        System.out.println("The assumption was satisfied and the test was run");

    }

}
