package com.via.skillsoft.junit.course2;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author via
 * 
 * @date 13 Oct 2022
 * 
 * @title using assert methods and their converse operations
 */
class EmployeeTest03 {

    static Employee firstEmployee;
    static Employee secondEmployee;

    @BeforeAll
    static void initEmployee() {

        firstEmployee = new Employee("Amy", "Cruz", 1001, 'F', "Developer", 50000, "Permanent");

        secondEmployee = new Employee("Brian", "Alford", 1011, 'M', "Developer", 45000, "Contract");
    }

    @Test
    void assertTest() {
        assertTrue(firstEmployee.getRole().equals(secondEmployee.getRole()),
                "Test that both employees have the same role");
    }

    @Test
    void assertTest02() {
        Employee firstShallowCopy = firstEmployee;
        Employee firstSeparateCopy = new Employee(firstEmployee.getFirstName(),
                firstEmployee.lastName, firstEmployee.getId(), firstEmployee.getGender(),
                firstEmployee.getRole(), firstEmployee.getSalary(), firstEmployee.getType());

        assertSame(firstEmployee.getRole(), firstSeparateCopy.getRole());
    }

}
