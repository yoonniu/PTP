package cardHand;

import cards.*;
import cards.Card.*;
import static cards.Card.*;
import static cards.Card.Constant.*;

public class Hand {
    
    private Card[] cards;
    
    // Konstruktor, der beliebig viele Karten entgegennimmt und null-Werte ignoriert
    public Hand(Card... inputCards) {
        
        setHandCards(inputCards);
        
    }
    // Methode zum Hinzufügen von Karten zur Hand, ignoriert null-Werte
    public void add(Card... newCards) {
        //TODO DONE direktes assert
        assert newCards != null: "Keine Karten.";
        
        //TODO DONE bei ungültigen Karten soll abgebrochen werden (assert)
        // Zähle die gültigen (nicht-null) neuen Karten
        //TODO einige Schleifen können entfallen
        
        //Erstellen eines neuen Arrays mit der Größe von vorhandenen und neuen Karten
        Card[] updatedCards = new Card[this.cards.length + newCards.length];
        
        int currentIndex = 0;
        // Fülle das aktualisierte Array mit den vorhandenen Karten
        for (int cardIndex = 0; cardIndex < this.cards.length; cardIndex++) {
            assert this.cards[cardIndex] != null: "ungültige Karten";
            updatedCards[currentIndex++] = this.cards[cardIndex];
        }
        
        //Fülle weiter mit den neuen Karten
        for (int cardIndex = 0; cardIndex < newCards.length; cardIndex++) {
            assert newCards[cardIndex] != null: "Ungültige Karten.";
            updatedCards[currentIndex++] = newCards[cardIndex];
        }
        
        this.cards = updatedCards;
    }

    //Methode zum Hinzufügen der Karten einer anderen Hand zur aktuellen Hand
    public void add(Hand otherHand) {
        add(otherHand.getHandCards());
    }
    
    // Methode zum Überprüfen, ob alle Karten die gleiche Farbe haben
    public boolean isSuited() {
        assert cards != null: "Ungültige Karten.";
        //TODO DONE Suit firstSuit diese im if verwenden
        if (cards.length == 0) return true; // Leere Hand ist per Definition suited
        
        Suit firstSuit = cards[0].getSuit();
        for (int cardIndex = 1; cardIndex < cards.length; cardIndex++) {
            //TODO DONE direct == der Konstanten verwenden
            if (cards[cardIndex].getSuit() != firstSuit) {
                return false;
            }
        }
        return true;
    }

    // Methode zum Abrufen der Karten in der Hand
    public Card[] getHandCards() {
        return cards;
    }

    // Methode zum Setzen der Karten in der Hand, ignoriert null-Werte
    //Überschreiben von aktuellen Karten und neue Karten werden aufgenommen
    public void setHandCards(Card... newCards) {
        assert newCards != null: "ungültige Karten";
        
        this.cards = new Card[newCards.length];
        
        int currentIndex = 0;
        // Fülle das Array mit gültigen Karten
        for (int cardIndex = 0; cardIndex < newCards.length; cardIndex++) {
            assert newCards[cardIndex] != null: "Karte bei Kartenindex "+ cardIndex + " ist null.";
            this.cards[currentIndex++] = newCards[cardIndex];
        }
    }
}
