package com.blp.workshopproblem;

/**
 * Deck of cards program
 */
public class DeckOfCards {
    public static int[] deck;
    public static String suit;
    public static String rank;

    public static void main(String[] args) {
        System.out.println("Welcome to deck of cards");
        initializeCards();
        Player person = new Player();
        person.numOfPlayer();
        person.sequence();
        shuffleCards();
    }

    /**
     * Initialize deck by calling method.
     */
    private static void initializeCards() {
        deck = new int[52];
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        for (int i = 1; i <= deck.length - 1; i++) {
            deck[i] = i;
            System.out.print(deck[i] + " ");
        }
        for (int i = 0; i < deck.length; i++) {
            suit = suits[deck[i] / 13];
            rank = ranks[deck[i] % 13];
            System.out.println(rank + " " + "of" + " " + suit);
        }
    }

    /**
     * Shuffle the cards for distribution
     */
    private static void shuffleCards() {
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);
            int card = deck[i];
            deck[i] = deck[index];
            System.out.println("shuffled cards = " + deck[i]);
        }
    }
}
