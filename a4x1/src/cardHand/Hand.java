package cardHand;

import cards.*;
import cards.Card.*;
import static cards.Card.*;
import static cards.Card.Constant.*;

public class Hand {

    public Card[] cards;
    public int size;

    // Constructor : accepts any number of cards
    public Hand(Card... initialCards) {
        this.cards = new Card[initialCards.length];
        this.size = 0;
        for (int i = 0; i < initialCards.length; i++) {
            Card card = initialCards[i];
            if (card != null) {
                this.cards[size++] = card; // load cards in array
            }
        }
    }

    // Procedure add(): add new cards
    public void add(Card... newCards) {
        int newSize = size + newCards.length; //check if new cards fit into current array
        if (newSize > cards.length) {
            expandArray(newCards.length); //if it doesn't fit > method to expand array
        }
        for (int i = 0; i < newCards.length; i++) { //load new cards into array
            Card card = newCards[i];
            if (card != null) {
                cards[size++] = card;
            }
        }
    }

    // Procedure add(): add cards of another hand
    public void add(Hand otherHand) {
        Card[] otherHandCards = otherHand.getHandCards();
        for (int i = 0; i < otherHandCards.length; i++) {
            Card card = otherHandCards[i];
            if (card != null) {
                if (size == cards.length) {
                    expandArray(cards.length);
                }
                cards[size++] = card;
            }
        }
    }

    // Function isSuited(): check if cards have the same suit
    public boolean isSuited() {
        if (size == 0) return true; //empty hand > suited
        Suit suit = cards[0].getSuit(); //color of first card as reference
        for (int i = 1; i < size; i++) { //compare all cards to first card
            if (!cards[i].getSuit().equals(suit)) { 
                return false;
            }
        }
        return true;
    }

    // Function getHandCards(): returns all cards in hand
    public Card[] getHandCards() {
        Card[] currentCards = new Card[size];
        for (int i = 0; i < size; i++) { //cards get loaded into currentcards
            currentCards[i] = cards[i];
        }
        return currentCards;
    }

    // Procedure setHandCards(): sets hand on new cards
    public void setHandCards(Card... newCards) {
        this.cards = new Card[newCards.length];
        this.size = 0;
        for (int i = 0; i < newCards.length; i++) {
            Card card = newCards[i];
            if (card != null) {
                this.cards[size++] = card; //++ du prepare the array to save new card
            }
        }
    }

    // expand array
    private void expandArray(int additionalCapacity) {
        int newCapacity = cards.length + additionalCapacity;
        Card[] newCards = new Card[newCapacity];
        for (int i = 0; i < size; i++) {
            newCards[i] = cards[i];
        }
        cards = newCards;
    }
}
