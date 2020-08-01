/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4305group3.playerproject;

/**
 *
 * @author Ivan Piesh
 * @author Sara Sobczyk
 * @author Dawn Tauriac
 * @author Kevin Taylor
 */
public class NFLPlayerA extends PlayerAbs {

    /**
     *
     * @param name
     * @param stats
     */
    public NFLPlayerA(String name, int stats) {
        super(name, stats);
        this.sport = "NFL";
    }

    /**
     *
     * @return stats
     */
    @Override
    int getStatsAbs() {
        return stats;
    }

    /**
     *
     * @return sport
     */
    @Override
    String getSportAbs() {
        return sport;
    }
}
