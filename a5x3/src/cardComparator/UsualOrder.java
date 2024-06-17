package cardComparator;

import static cards.Card.*;
import static cards.Card.Constant.*;
import cards.*;
import cards.Card.*;
import java.util.*;


/**
 * Comparator for Cards defining "usual order"
 * 
 * @author   Fenja 
 * @version  16.06.2024 01
 */

public class UsualOrder implements Comparator<Card> {
    
    //desired order
    Rank[] rankOrder = new Rank[] {ACE, KING, QUEEN, JACK, TEN, NINE, EIGHT, SEVEN, SIX, FIVE, FOUR, THREE, TWO};
    Suit[] suitOrder = new Suit[] {CLUB, SPADES, HEART, DIAMOND};

    @Override
    public int compare(Card c1, Card c2) {
        
        //Position im Enum wird ermittelt und in rankOrder abgeglichen
        //Positionen werden subtrahiert > entscheidet wie sortiert wird
        int compareRank = rankOrder[c1.getRank().ordinal()].ordinal() -
                rankOrder[c2.getRank().ordinal()].ordinal();
        
        int compareSuit = suitOrder[c1.getSuit().ordinal()].ordinal() -
              suitOrder[c2.getSuit().ordinal()].ordinal();
        
        //ternäre Operator > if else
        //Bedingung ? Ausdruck1 : Ausdruck2 
        //wenn die Ränge unterschiedlich sind wird nach ihnen sortiert, wenn nicht nach Farben (suit)
        return compareRank != 0 ? compareRank : compareSuit;
    }
}