package com.mycompany.assignment2;

public class PlayingCards {
    public static void main(String[] args) {
        System.out.println("***************************Playing Cards**************************");
        Deck deck=new Deck();
        deck.create();
        System.out.println("Deck has been created");

        System.out.println("**************************Sorted Cards**************************");
        deck.sort();
        deck.showCards();

        System.out.println("**************************Shuffled Cards**************************");
        deck.shuffle();
        deck.showCards();

    }
}
