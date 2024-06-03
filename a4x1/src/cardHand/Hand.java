package cardHand;

import cards.*;
import cards.Card.*;
import static cards.Card.*;
import static cards.Card.Constant.*;

public class Hand {
    
    public Card[] cards;
    public int size;

        // Konstruktor: Nimmt beliebig viele Karten entgegen
        public Hand(Card... initialCards) { //... damit eine Variable Anzahl an Argumenten des Typs übernehmen werden können
            this.cards = new Card[initialCards.length];
            this.size = 0;
            for (Card card : initialCards) {
                if (card != null) {
                    this.cards[size++] = card; //Karten werden in Array gespeichert
                }
            }
        }

        /*// Prozedur add(): Fügt Karten hinzu
        public void add(Card... newCards) {
            for (Card card : newCards) { //Iterieren durch newCards
                if (card != null) {
                    if (size == cards.length) { //check if card array is full
                        expandArray();
                    }
                    cards[size++] = card; //iteration, safe card and cards array
                }
            }
        }*/
        public void add(Card... newCards) {
            int newSize = size + newCards.length;
            if (newSize > cards.length) {
                expandArray(newCards.length);
            }
            for (Card card : newCards) {
                if (card != null) {
                    cards[size++] = card;
                }
            }
        }

        // Procedure add(): adds cards to another hand
        public void add(Hand otherHand) {
            for (Card card : otherHand.getHandCards()) {
                if (card != null) {
                    if (size == cards.length) {
                        expandArray(cards.length);
                    }
                    cards[size++] = card;
                }
            }
        }

        // Funktion isSuited(): Überprüft, ob alle Karten dieselbe Farbe haben
        public boolean isSuited() {
            if (size == 0) return true; //empty hand > suited
            Suit suit = cards[0].getSuit(); //color of first card as
            for (int i = 1; i < size; i++) {
                if (!cards[i].getSuit().equals(suit)) { 
                    return false;
                }
            }
            return true;
        }

        // Funktion getHandCards(): Liefert alle Karten in der Hand
        public Card[] getHandCards() {
            Card[] currentCards = new Card[size];
            System.arraycopy(cards, 0, currentCards, 0, size);
            return currentCards;
        }

        // Prozedur setHandCards(): Setzt die Hand auf neue Karten
        public void setHandCards(Card... newCards) {
            this.cards = new Card[newCards.length];
            this.size = 0;
            for (Card card : newCards) {
                if (card != null) {
                    this.cards[size++] = card;
                }
            }
        }

        /*// Hilfsprozedur: Erweitert das Array
        private void expandArray() {
            Card[] newCards = new Card[cards.length * 2];
            System.arraycopy(cards, 0, newCards, 0, size);
            cards = newCards;
        }*/
        private void expandArray(int additionalCapacity) {
            int newCapacity = cards.length + additionalCapacity;
            Card[] newCards = new Card[newCapacity];
            System.arraycopy(cards, 0, newCards, 0, size);
            cards = newCards;
        }
    }

