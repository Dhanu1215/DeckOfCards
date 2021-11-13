package com.blp.workshopproblem;

import java.util.Scanner;

public class Player {
    /**
     * Call method to get players from user.
     */
    public static int players;

    public void numOfPlayer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of players");
        players = sc.nextInt();
        if (players < 2 || players > 4) {
            System.out.println("Enter number of players between two and four");
        } else
            System.out.println("Number of players = " + players);
    }

    /**
     *  Call the method to sequence the player for getting cards.
     */

    public static void sequence() {
        int j = 1;
        for (int i = 1; i <= players; i++) {
            System.out.println("Card" + j++ + " received by player" + i);
        }
    }
}