/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.skillsoft.junit.course2;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import javax.naming.NamingException;

/**
 * 
 * @author via
 * 
 * @date 19 Oct 2022
 */
class EmployeeTest06 {

    static Employee firstEmployee;

    @BeforeAll
    static void initEmployee() {
        firstEmployee = new Employee("Susan", "4orrester", 1005, 'F',
                "Tech Lead", 80000, "Permanent");
    }

    @Test
    void assertTest() throws InterruptedException {

        firstEmployee.adjustSalary(4000);

        assertAll("Test Employee",
                () -> assertEquals(84000, firstEmployee.getSalary()),
                () -> assertNotNull(firstEmployee.getFirstName()),
                () -> assertThrows(NamingException.class, () -> {
                    firstEmployee.validateLastName();
                }));
    }

    @Test
    void assertTest2() {

        firstEmployee.addProject("Blue flame");
        firstEmployee.addProject("Black box");

        ArrayList<String> compareList = new ArrayList<>();
        compareList.add("Blue flame");
        compareList.add("Black box");

        assertIterableEquals(compareList, firstEmployee.getProjects());

    }

}
