/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.skillsoft.junit.course4;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;

/**
 * 
 * @author via
 * 
 * @date 24 Oct 2022
 * 
 * @apiNote Working with different parameter sources in JUnit
 */
class EmployeeTest04 {

    @ParameterizedTest
    @NullSource
    @DisplayName("Null name check")
    void nameTest(String name) {

        Employee04 employee = new Employee04(name, name, 1011, 'M', "Tester",
                50000, "Contract");

        assertNull(employee.getFirstName());
        assertNull(employee.getLastName());

    }

    @ParameterizedTest
    @EmptySource
    @DisplayName("Empty name check")
    void emptyName(String name) {

        Employee04 employee = new Employee04(name, name, 1011, 'M', "Tester",
                50000, "Contract");

        assertEquals("", employee.getFirstName());
        assertEquals("", employee.getLastName());

    }

    @ParameterizedTest
    @NullAndEmptySource
    @DisplayName("Null and Empty name check")
    void nullAndEmptyNameTest(String name) {

        Employee04 employee = new Employee04(name, name, 1011, 'M', "Tester",
                50000, "Contract");

        String firstName = employee.getFirstName();

        assertTrue(firstName == null || firstName.isEmpty());

    }

    @ParameterizedTest
    @CsvSource({"Briam, Alford", "Amy, Cruz", "Raj, Chawanda"})
    @DisplayName("CSV name")
    void csvName(String fName, String lName) {

        Employee04 employee = new Employee04(fName.trim(), lName.trim(), 1011,
                'M', "Tester", 50000, "Contract");

        assertEquals(fName.trim(), employee.getFirstName());
        assertEquals(lName.trim(), employee.getLastName());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/empnames.csv", numLinesToSkip = 1)
    @DisplayName("CSV File name Check")
    void csvFileSourceName(String fName, String lName) {

        Employee04 employee = new Employee04(fName.trim(), lName.trim(), 1011,
                'M', "Tester", 50000, "Contract");

        assertEquals(fName.trim(), employee.getFirstName());
        assertEquals(lName.trim(), employee.getLastName());
    }
}
