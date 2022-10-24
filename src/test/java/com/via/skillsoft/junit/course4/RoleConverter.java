/**
 * Licensed Materials - Property of hunchmen
 * 
 * (C) hunchmen. 2022. All Rights Reserved.
 * 
 */
package com.via.skillsoft.junit.course4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

/**
 * 
 * @author via
 * 
 * @date 24 Oct 2022
 */
public class RoleConverter extends SimpleArgumentConverter {

    /*
     * (non-Javadoc)
     * 
     * @see org.junit.jupiter.params.converter.SimpleArgumentConverter#convert(java.lang.Object,
     * java.lang.Class)
     */
    @Override
    protected Object convert(Object source, Class<?> targetType)
            throws ArgumentConversionException {

        assertEquals(String.class, targetType);
        return String.valueOf(source).toUpperCase();
    }



}
