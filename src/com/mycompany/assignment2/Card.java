package com.mycompany.assignment2;

public class Card extends Cards {

    public final static int SPADES = 0,
            HEARTS = 1,
            DIAMONDS = 2,
            CLUBS = 3;
    private final int suit;
    private final int rank;

    public Card(int theRank, int theSuit) {
        rank = theRank;
        suit = theSuit;
    }

    public String getSuitAsString() {
        switch ( suit ) {
            case SPADES:   return "Spades";
            case HEARTS:   return "Hearts";
            case DIAMONDS: return "Diamonds";
            case CLUBS:    return "Clubs";
            default:       return "??";
        }
    }

    public String getRankAsString() {
        switch ( rank ) {
            case 1:   return "Ace";
            case 2:   return "2";
            case 3:   return "3";
            case 4:   return "4";
            case 5:   return "5";
            case 6:   return "6";
            case 7:   return "7";
            case 8:   return "8";
            case 9:   return "9";
            case 10:  return "10";
            case 11:  return "Jack";
            case 12:  return "Queen";
            case 13:  return "King";
            default:  return "??";
        }
    }

    public String toString() {
        return getRankAsString() + " of " + getSuitAsString();
    }

}
