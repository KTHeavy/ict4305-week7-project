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
public class NBAPlayerITest {
    
    String name = "LeBron James";
    int stats = 12-4;
    String sport = "NBA";
    NBAPlayerI details = new NBAPlayerI(name, stats);

    /**
     * Test of getName method, of class NFLPlayerI.
     */
    @Test
    public void testGetName() {
        String expected = "LeBron James";
        String actual = details.getName();
        
        assertEquals(expected, actual);
    }

    /**
     * Test of getStats method, of class NFLPlayerI.
     */
    @Test
    public void testGetStats() {
        int expected = 12-4;
        int actual = details.getStats();
        
        assertEquals(expected, actual);
    }

    /**
     * Test of getSport method, of class NFLPlayerI.
     */
    @Test
    public void testGetSport() {
        String expected = "NBA";
        String actual = details.getSport();
        
        assertEquals(expected, actual);
    }
    
}
