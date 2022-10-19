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
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

/**
 * 
 * @author via
 * 
 * @date 19 Oct 2022
 * 
 * @apiNote working with concurrent test and timeouts
 */

@Execution(ExecutionMode.CONCURRENT)
class ProductTest08 {

    static Product tv;

    @BeforeAll
    static void init() {
        tv = new Product("Diallonic", "Delta", 13423, 800.0, "Electronics");
    }

    @Test
    @DisplayName("Brand Name Check")
    void brandNameTest() throws InterruptedException {
        Thread.sleep(4000);
        assertEquals("Diallonic", tv.getBrandName(), "Brand name test");
    }

    @Test
    @DisplayName("Price Check")
    void priceTest() throws InterruptedException {
        Thread.sleep(3000);
        assertEquals(800, tv.getPrice(), "Price Test");
    }

    @Test
    @DisplayName("Category Check")
    void categoryCheck() throws InterruptedException {
        Thread.sleep(5000);
        assertEquals("Electronics", tv.getCategory(), "Category Test");
    }

    @Test
    @DisplayName("Model Check")
    void modelCheck() throws InterruptedException {
        Thread.sleep(2000);
        assertEquals("Electronics", tv.getCategory(), "Model Test");
    }

}
