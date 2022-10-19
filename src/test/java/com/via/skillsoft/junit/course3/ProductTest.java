/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.skillsoft.junit.course3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author via
 * 
 * @date 19 Oct 2022
 * 
 * @apiNote Setting a display name for a test case
 */
class ProductTest {

    static Product tv;

    @BeforeAll
    static void init() {
        tv = new Product("Diallonic", "Delta", 13423, 800.0, "Electronics");
    }

    @Test
    @DisplayName("Brand Name Check")
    void brandTestName() {
        assertEquals("Diallonic", tv.getBrandName(), "Brand name test");
    }

    @Test
    @DisplayName("Price Check")
    void priceTest() {
        assertEquals(800, tv.getPrice(), "Price Test");
    }
    
    @Test
    @DisplayName("Category Check")
    void categoryCheck() {
        assertEquals("Electronics", tv.getCategory(), "Category Test");
    }

}
