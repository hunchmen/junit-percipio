/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.skillsoft.junit.course4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import javax.naming.InvalidNameException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * 
 * @author via
 * 
 * @date 24 Oct 2022
 * 
 * @apiNote Running parameterized tests with a ValueSource
 */
class EmployeeTest03 {

    // static Employee03 employee;
    // static double salary;

    // @BeforeAll
    // static void initEmployee() {
    // salary = 45000;
    // employee = new Employee03("Brian", "Alford", 1011, 'M', "Tester",
    // salary, "Contract");
    //
    // }
    //
    // @ParameterizedTest
    // @DisplayName("salary update")
    // @ValueSource(doubles = {500, 1000, 1300, 2400, 3500, 4000, 6000})
    // void salaryUpdateTest(double salaryIncrement) {
    //
    // employee.adjustSalary(salaryIncrement);
    // salary += salaryIncrement;
    //
    // assertEquals(salary, employee.getSalary(), "Test salary updates");
    // }

    @ParameterizedTest
    @DisplayName("Last Name check")
    @ValueSource(strings = {"Al4d", "B3nson", "$mith", "@lford"})
    void nameTest(String lastName) {

        Employee03 employee = new Employee03("Brian", lastName, 1011, 'M',
                "Tester", 50000, "Contract");

        assertThrows(InvalidNameException.class, () -> {
            employee.validateLastName();
        }, "Throws execption test");
    }

}
