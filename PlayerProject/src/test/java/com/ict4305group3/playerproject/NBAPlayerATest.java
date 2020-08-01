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
public class NBAPlayerATest {
    
    NBAPlayerA player = new NBAPlayerA("Shaquille O'Neal", 1207);
    
    /**
     * Test of thrown exceptions for name argument, of abstract class PlayerAbs.
     */
    @Test
    public void testIllegalNameExcetption() {
        try {
            NBAPlayerA player = new NBAPlayerA("", 1207);
        } catch (IllegalArgumentException e) {
            String errorName = "Name cannot be blank";
            assertEquals(errorName, e.getMessage());
        }
    }

     /**
     * Test of getNameAbs method, of abstract class PlayerAbs.
     */
    @Test
    public void testGetNameAbs() {
        String e = "Shaquille O'Neal";
        String a = player.name;
        assertEquals(e, a);
    }
    
    /**
     * Test of getStatsAbs method, of class NBAPlayerA.
     */
    @Test
    public void testGetStatsAbs() {
        int e = 1207;
        int a = player.stats;
        assertEquals(e, a);        
    }

    /**
     * Test of getSportAbs method, of class NBAPlayerA.
     */
    @Test
    public void testGetSportAbs() {
        String e = "NBA";
        String a = player.sport;
        assertEquals(e, a);
    }
    
}
