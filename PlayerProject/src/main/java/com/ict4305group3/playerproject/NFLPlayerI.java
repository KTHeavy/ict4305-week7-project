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
public class NFLPlayerI implements Player {

    private final String name;
    private int stats;
    private String sport;

    /**
     *
     * @param name
     * @param stats
     */
    public NFLPlayerI(String name, int stats) {
        this.name = name;
        this.stats = stats;
        this.sport = "NFL";
        if (name.isBlank()) throw new IllegalArgumentException("Name cannot be blank");
    }

    /**
     *
     * @return name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     *
     * @return stats
     */
    @Override
    public int getStats() {
        return stats;
    }

    /**
     *
     * @return sport
     */
    @Override
    public String getSport() {
        return sport;
    }
}
