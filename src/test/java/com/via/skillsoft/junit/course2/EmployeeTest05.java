/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.skillsoft.junit.course2;

import static org.junit.jupiter.api.Assertions.*;
import javax.naming.InvalidNameException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author via
 * 
 * @date 19 Oct 2022
 */
class EmployeeTest05 {

    static Employee firstEmployee;

    @BeforeAll
    static void initEmployee() {
        firstEmployee = new Employee("Susan", "4orrester", 1005, 'F',
                "Tech Lead", 800000, "Permanent");
    }

    @Test
    void assertTest() {
        assertThrows(InvalidNameException.class, () -> {
            firstEmployee.validateLastName();
        }, "Throws exception test");
    }

}
