/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4305group3.playerproject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ssobczyk
 */
public class NFLPlayerITest {
    
    String name = "Peyton Manning";
    int stats = 2-8;
    String sport = "NFL";
    NFLPlayerI details = new NFLPlayerI(name, stats);

    /**
     * Test of getName method, of class NFLPlayerI.
     */
    @Test
    public void testGetName() {
        String expected = "Peton Manning";
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
