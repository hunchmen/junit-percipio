/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.skillsoft.junit.course4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.stream.Stream;
import javax.naming.InvalidNameException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * 
 * @author via
 * 
 * @date 24 Oct 2022
 * 
 * @apiNote Defining an argument converter
 */
class EmployeeTest05 {

    static Stream<String> getLastNames() {
        return Stream.of("Al4ad", "B3nson", "$mith", "@lford");
    }

    @ParameterizedTest(name = "Test #{index} - Last name: {0}")
    @MethodSource("getLastNames")
    @DisplayName("Name check")
    void nameTest(String lName) {

        Employee employee = new Employee("Brian", lName, 1011, 'M', "Developer",
                50000, "Contract");

        assertThrows(InvalidNameException.class, () -> {
            employee.validateLastName();
        }, "Throws exception test");

    }

    @ParameterizedTest
    @ValueSource(strings = {"developer", "tester", "release engineer",
            "storage engineer"})
    @DisplayName("Role Check")
    void converterTest(@ConvertWith(RoleConverter.class) String role) {

        Employee employee = new Employee("Brian", "Alford", 1011, 'M', role,
                50000, "Contract");

        System.out.println("Value of role: " + role);

        assertEquals(role, employee.getRole());


    }

}
