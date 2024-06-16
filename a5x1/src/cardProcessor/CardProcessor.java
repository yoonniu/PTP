// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package cardProcessor;


import static cards.Card.*;
import static cards.Card.Constant.*;
//
import cards.*;
import cards.Card.*;
import java.util.*;

/**
 * CardProcessor printing cards in reverse order - see task
 * 
 * @author   Fenja 
 * @version  15.06.2024 01
 */
public class CardProcessor {
    
    /**
     * Die Methode reverseOrder() zieht solange Karten von einem Kartenstapel
     * bis eine gewünschte Karte gezogen wird
     * und gibt danach alle gezogenen Karten in umgekehrter Reihenfolge wieder aus.
     *
     * @param deck              der Kartenstapel von dem die Karten gezogen werden.
     * @param lastCard          die gewünschte Karte, die die Ziehung beendet.
     * @param dbgOutputEnable   true schaltet Kontrollausgabe an und false aus.
     */
     public void reverseOrder(Deck deck, Card lastCard, boolean dbgOutputEnable) {
         Stack<Card> stack = new Stack<>();
         boolean match = false;

         // Loop until the desired card is drawn
         while (!match) {
             Card currentCard = deck.deal(); // Draw a card from the deck
             stack.push(currentCard); // Push the drawn card onto the stack

             // Print the current card if debug output is enabled
             if (dbgOutputEnable) {
                 System.out.println("Drawn card: " + currentCard);
             }

             // Check if the current card is the desired card
             if (currentCard.equals(lastCard)) {
                 match = true;
             }
         }

         // Print the cards in reverse order (LIFO)
         while (!stack.isEmpty()) {
             System.out.println(stack.pop());
         }
         
     }
     //brauchen wir hier toString?
//     @Override
//     public String toString() {
//         return String.format("<%s>: deck:%s, lastCard:%s, dbgOutputEnable:%d" CardProcessor.class.getSimpleName(), deck, lastCard, dgbOutputEnable);
//     }
}//class

