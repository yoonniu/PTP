package cardComparator;

import static cards.Card.*;
import static cards.Card.Constant.*;
import cards.*;
import cards.Card.*;
import java.util.*;


/**
 * Comparator for Cards defining "usual order"
 * 
 * @author   Fenja, Ilja 
 * @version  16.06.2024 01
 */

public class UsualOrder implements Comparator<Card> {
    /**
     * Die Methode compare() vergleicht mind. zwei Karten auf ihre Priorität (im Enum).
     * Und danach werden die Karten nach ihrer Priorität sortiert
     * Priorität für Suit/Rank sind auch unten im Array festgelegt
     *  
     *
     * @param c1 & c2   die zwei zu vergleichenden Karten.
     * 
     * @return          gibt den integer Wert zurück nachdem die Karten sortiert wird.
     */


    //desired order
    final Rank[] rankOrder = new Rank[] {ACE, KING, QUEEN, JACK, TEN, NINE, EIGHT, SEVEN, SIX, FIVE, FOUR, THREE, TWO};
    final Suit[] suitOrder = new Suit[] {CLUB, SPADES, HEART, DIAMOND};





    @Override
    public int compare(Card c1, Card c2) {
        //assert c1 != c2: "Cards may not be identical, as there is only one deck to choose from.";
        assert c1 != null && c2 != null: "Cards must exist! They are currently null";
        // create variables to improve readability
        Rank firstRank = c1.getRank();
        Rank secondRank = c2.getRank();
        Suit firstSuit = c1.getSuit();
        Suit secondSuit = c2.getSuit();


        //find out position of enum and match to desired order
        //positions are subtracted > determine which card comes first according to (rank) order 
        //lower enum (two has enum 12 / ace has enum 0) -> higher priority  
        final int compareRank = rankOrder[firstRank.ordinal()].ordinal() - rankOrder[secondRank.ordinal()].ordinal();

        int result = compareRank;

        if(compareRank == 0) {
            final int compareSuit = suitOrder[firstSuit.ordinal()].ordinal() - suitOrder[secondSuit.ordinal()].ordinal();
            result = compareSuit;
        }


        //ternary Operator > if else
        //Condition ? Expression1 : Expression2 
        //when ranks are different sort according to rank, else according to suit

        // 
        return result;
        //TODO Debug enable + Berechnung nur dann, wenn nötig

    }
}


/* 
boolean debugOutputEnable = false;

while(debugOutputEnable) {


    System.out.printf("\n\n");
    System.out.printf("Rank result: %s, %s", c2, c1);
    System.out.println(compareRank);
    System.out.printf("\n\n");
    System.out.printf("Suit result: %s, %s", c2, c1);
    System.out.println(compareSuit);

    debugOutputEnable = false;
    System.out.printf("\n");
}*/