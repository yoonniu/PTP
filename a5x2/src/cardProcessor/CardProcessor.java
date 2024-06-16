// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package cardProcessor;


import static cards.Card.*;
import static cards.Card.Constant.*;
import cards.*;
import cards.Card.*;
import java.util.*;


/**
 * CardProcessor removing duplicates - see task
 * 
 * @author   Fenja 
 * @version  15.06.2024 01
 */
public class CardProcessor {
    
    /**
     * Die Methode removeDuplicates() entfernt Doppelte aus den übergebenen Karten.
     * Welche Karte (von den mehrfach vorhandenen Karten) übrig bleibt ist egal.
     * Wichtig ist, dass es bei den als Ergebnis abgelieferten Katen keine Doppelten gibt,
     * aber sonst jede Karten erhalten bleibt. 
     *
     * @param cards     die übergebenen Karten aus denen die Doppelten entfernt werden.
     * 
     * @return          die Karten befreit von Doppelten.
     */
    
    //import java.util.ArrayList;
    
    public Card[] removeDuplicates(Card...cards){

        ArrayList<Card> noDoubles = new ArrayList<>();
        
        for (Card currentCard : cards) {
            if (!noDoubles.contains(currentCard)) {
                noDoubles.add(currentCard);
            }
        }
        Card[] result = new Card[noDoubles.size()];
        return noDoubles.toArray(result);
    }

}//class
