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
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.JRE;

/**
 * 
 * @author via
 * 
 * @date 19 Oct 2022
 * 
 * @apiNote Turning tests on or off based on JRE version
 */
class ProductTest04 {

    static Product tv;

    @BeforeAll
    static void init() {
        tv = new Product("Diallonic", "Delta", 13423, 800.0, "Electronics");
    }

    @Test
    @DisplayName("Brand Name Check")
//    @EnabledOnJre(JRE.JAVA_8)
    @EnabledForJreRange(max = JRE.JAVA_11)
    void brandTestName() {
        assertEquals("Diallonic", tv.getBrandName(), "Brand name test");
    }

    @Test
    @DisplayName("Price Check")
//    @EnabledOnJre(JRE.JAVA_9)
    @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_16)
    void priceTest() {
        assertEquals(800, tv.getPrice(), "Price Test");
    }

    @Test
    @DisplayName("Category Check")
//    @EnabledOnJre(JRE.JAVA_16)
    @EnabledForJreRange(min = JRE.JAVA_11)
    void categoryCheck() {
        assertEquals("Electronics", tv.getCategory(), "Category Test");
    }

}
