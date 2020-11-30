public class Deck extends  Cards{

    public void sort() {
    }

    public void showCards() {
    }


    private Card[] deck;   // An array of 52 Cards, representing the deck.
    private int cardsUsed; // How many cards have been dealt from the deck.

    public void create() {
        // Create an unshuffled deck of cards.
        deck = new Card[52];
        int cardCt = 0; // How many cards have been created so far.
        for ( int suit = 0; suit <= 3; suit++ ) {
            for ( int value = 1; value <= 13; value++ ) {
                deck[cardCt] = new Card(value,suit);
                System.out.println(deck[cardCt]);
                cardCt++;
            }
        }
        cardsUsed = 0;
    }

    public void shuffle() {
        // Put all the used cards back into the deck, and shuffle it into
        // a random order.
        for ( int i = 51; i > 0; i-- ) {
            int rand = (int)(Math.random()*(i+1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;

            System.out.println(deck[rand]);
        }
        cardsUsed = 0;
    }

    public Card dealCard() {
        // Deals one card from the deck and returns it.
        if (cardsUsed == 52)
            shuffle();
        cardsUsed++;
        return deck[cardsUsed - 1];
    }

}
