/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.skillsoft.junit.course2;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.time.Duration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author via
 * 
 * @date 13 Oct 2022
 * 
 * @title testing for timeouts and nulls using junit
 */
class EmployeeTest04 {

    static Employee firstEmployee;

    @BeforeAll
    static void initEmployee() {

        firstEmployee = new Employee("Amy", "Cruz", 1001, 'F', "Developer",
                500000, "Permanent");
    }

    @Test
    void assertTest() {
        assertTimeout(Duration.ofSeconds(5), () -> {
            firstEmployee.adjustSalary(2000);
        });
    }

}
