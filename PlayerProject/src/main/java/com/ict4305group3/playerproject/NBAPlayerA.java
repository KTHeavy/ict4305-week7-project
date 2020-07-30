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

public class NBAPlayerA extends PlayerAbs{


  public NBAPlayerA(String name, int stats) {
	this.name = name;
	this.stats = stats;
	this.sport = "NBA";
  }


  public int getStatsAbs() {
	return stats;
  }


  public String getSportAbs() {
	return sport;
  }
  
}
