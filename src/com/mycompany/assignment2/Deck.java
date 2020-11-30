package com.mycompany.assignment2;

public class Deck extends  Cards{

    Card[] deck=new Card[52];
    int cardCt = 0;

    public void create() {
        for ( int suit = 0; suit <= 3; suit++ ) {
            for ( int rank = 1; rank <= 13; rank++ ) {
                deck[cardCt] = new Card(rank,suit);
                cardCt++;
            }
        }
    }

    public void showCards() {
      for(int i=0;i<deck.length;i++){
          System.out.println(deck[i]);
      }
    }

    public void shuffle() {
        for ( int i = 51; i > 0; i-- ) {
            int rand = (int)(Math.random()*(i+1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
    }

    public void sort() {
        for (int i = 1; i < deck.length; ++i) {
            Card nextItem = deck[i];
            int j = i;
            while (j > 0 && deck[j-1].equals(nextItem)){
                deck[j] = deck[j-1];
                j--;
            }
            deck[j] = nextItem;
        }
    }

}
