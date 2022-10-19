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
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.JRE;

/**
 * 
 * @author via
 * 
 * @date 19 Oct 2022
 * 
 * @apiNote checking for system and environment variables
 */
class ProductTest05 {

    static Product tv;

    @BeforeAll
    static void init() {
        tv = new Product("Diallonic", "Delta", 13423, 800.0, "Electronics");

        System.out.println("System Properties");
        System.out.println("os.arch: " + System.getProperty("os.arch"));
        System.out.println("os.version: " + System.getProperty("os.version"));
        System.out.println("os.name: " + System.getProperty("os.name"));
        System.out.println("user.name: " + System.getProperty("user.name"));

        System.out.println("Environment Variables:");
        System.out.println("PWD: " + System.getenv("PWD"));
        System.out.println("USER: " + System.getenv("USER"));
        System.out.println("ALL: " + System.getenv());
    }

    @Test
    @DisplayName("Brand Name Check")
    // @EnabledIfSystemProperty(named = "os.arch", matches = "x86_64")
    @EnabledIfEnvironmentVariable(named = "PWD", matches = ".*junit.*")
    void brandNameTest() {
        assertEquals("Diallonic", tv.getBrandName(), "Brand name test");
    }

    @Test
    @DisplayName("Price Check")
//    @EnabledIfSystemProperty(named = "os.version", matches = "10\\..*")
    @EnabledIfEnvironmentVariable(named = "USER", matches = "loonycorn")
    void priceTest() {
        assertEquals(800, tv.getPrice(), "Price Test");
    }

    @Test
    @DisplayName("Category Check")
//    @EnabledIfSystemProperty(named = "os.name", matches = "Windows 10")
    @EnabledIfEnvironmentVariable(named = "USER", matches = "valal.*")
    void categoryCheck() {
        assertEquals("Electronics", tv.getCategory(), "Category Test");
    }

    @Test
    @DisplayName("Model Check")
//    @EnabledIfSystemProperty(named = "os.arch", matches = ".*_64")
    @EnabledIfEnvironmentVariable(named = "LANG", matches = "de_DE*")
    void modelCheck() {
        assertEquals("Delta", tv.getCategory(), "Model Test");
    }
}
