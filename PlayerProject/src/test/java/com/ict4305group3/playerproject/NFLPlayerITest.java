/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4305group3.playerproject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Ivan Piesh
 * @author Sara Sobczyk
 * @author Dawn Touriac
 * @author Kevin Taylor
 */
public class NFLPlayerITest {
    
    String name = "Peyton Manning";
    int stats = 2-8;
    NFLPlayerI details = new NFLPlayerI(name, stats);
    
    /**
     * Test of thrown exceptions for name argument, of class NFLPlayerI.
     */
    @Test
    public void testIllegalNameExcetption() {
        try {
            NFLPlayerI details = new NFLPlayerI("", stats);
        } catch (IllegalArgumentException e) {
            String errorName = "Name cannot be blank";
            assertEquals(errorName, e.getMessage());
        }
    }
     
    /**
     * Test of getName method, of class NFLPlayerI.
     */
    @Test
    public void testGetName() {
        String expected = "Peyton Manning";
        String actual = details.getName();
        
        assertEquals(expected, actual);
    }

    /**
     * Test of getStats method, of class NFLPlayerI.
     */
    @Test
    public void testGetStats() {
        int expected = 2-8;
        int actual = details.getStats();
        
        assertEquals(expected, actual);
    }

    /**
     * Test of getSport method, of class NFLPlayerI.
     */
    @Test
    public void testGetSport() {
        String expected = "NFL";
        String actual = details.getSport();
        
        assertEquals(expected, actual);
    }
    
}
