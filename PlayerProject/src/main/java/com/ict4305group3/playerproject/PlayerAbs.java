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
abstract class PlayerAbs {

    private final String name;
    protected int stats;
    protected String sport;
    
    public PlayerAbs(String name, int stats) {
        this.name = name;
        this.stats = stats;
        this.sport = "Not defined";
        if (name.isBlank()) throw new IllegalArgumentException("Name cannot be blank");
    }
    
    /**
     *
     * @return name
     */
    public String getNameAbs() {
        return name;
    }

    abstract int getStatsAbs();

    abstract String getSportAbs();
}
