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
public class PlayerMain {

    public static void main(String[] args) {
        
        var nflPlayer1 = new NFLPlayerA("Joe Montana", 192);
        var nbaPlayer1 = new NBAPlayerA("Michael Jordan", 1072);
        var nflPlayer2 = new NFLPlayerI("Jerry Rice", 303);
        var nbaPlayer2 = new NBAPlayerI("Larry Bird", 897);
        
        System.out.println("-------- Player Lifetime Games Played --------");
        System.out.println("\n" + nbaPlayer1.name + " | " + nbaPlayer1.stats + 
                " games played | " + nbaPlayer1.sport);
        System.out.println(nbaPlayer2.name + " | " + nbaPlayer2.stats + 
                " games played | " + nbaPlayer2.sport);
        System.out.println("\n" + nflPlayer1.name + " | " + nflPlayer1.stats + 
                " games played | " + nflPlayer1.sport);
        System.out.println(nflPlayer2.name + " | " + nflPlayer2.stats + 
                " games played | " + nflPlayer2.sport);
    }
}
