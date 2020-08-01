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
public class NFLPlayerATest {
    
    NFLPlayerA player = new NFLPlayerA("Dick Butkus", 119);
    
    /**
     * Test of thrown exceptions for name argument, of abstract class PlayerAbs.
     */
    @Test
    public void testIllegalNameExcetption() {
        try {
            NFLPlayerA player = new NFLPlayerA("", 119);
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
        String e = "Dick Butkus";
        String a = player.getNameAbs();
        assertEquals(e, a);
    }
    
    /**
     * Test of getStatsAbs method, of class NFLPlayerA.
     */
    @Test
    public void testGetStatsAbs() {
        int e = 119;
        int a = player.getStatsAbs();
        assertEquals(e, a);
    }

    /**
     * Test of getSportAbs method, of class NFLPlayerA.
     */
    @Test
    public void testGetSportAbs() {
        String e = "NFL";
        String a = player.getSportAbs();
        assertEquals(e, a);
    }
    
}
