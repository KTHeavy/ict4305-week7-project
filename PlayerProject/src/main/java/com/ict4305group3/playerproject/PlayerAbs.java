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
 * @author Dawn Touriac
 * @author Kevin Taylor
 */

abstract class PlayerAbs {
    public String name;
    public int stats;
    public String sport;

    public String getNameAbs() {
        return name;
    }

    abstract int getStatsA();
    abstract String getSportA();
}
