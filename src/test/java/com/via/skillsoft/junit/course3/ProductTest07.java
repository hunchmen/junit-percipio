/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.skillsoft.junit.course3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * 
 * @author via
 * 
 * @date 19 Oct 2022
 * 
 * @apiNote ordering test case executions
 */
//@TestMethodOrder(MethodOrderer.DisplayName.class)
class ProductTest07 {

    static Product tv;

    @BeforeAll
    static void init() {
        tv = new Product("Diallonic", "Delta", 13423, 800.0, "Electronics");
    }

    @Test
    @DisplayName("Brand Name Check")
    @Order(4)
    void brandNameTest() {
        assertEquals("Diallonic", tv.getBrandName(), "Brand name test");
    }

    @Test
    @DisplayName("Price Check")
    @Order(3)
    void priceTest() {
        assertEquals(800, tv.getPrice(), "Price Test");
    }

    @Test
    @DisplayName("Category Check")
    @Order(2)
    void categoryCheck() {
        assertEquals("Electronics", tv.getCategory(), "Category Test");
    }

    @Test
    @DisplayName("Model Check")
    @Order(1)
    void modelCheck() {
        assertEquals("Electronics", tv.getCategory(), "Model Test");
    }
}
