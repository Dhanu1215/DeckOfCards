package com.blp.workshopproblem;

import java.util.Scanner;

public class Player {
    /**
     * Call method to get players from user.
     */
    public void numOfPlayer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of players");
        int players = sc.nextInt();
        if (players < 2 || players > 4) {
            System.out.println("Enter number of players between two and four");
        }
        else
            System.out.println("Number of players = " +players);
    }
}
