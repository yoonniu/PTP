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
 * @author   (Fenja, Ilja) 
 * @version  (a version number or a date)
 */
public class CardProcessor {
    
    /**
     * Die Methode reverseOrder() zieht solange Karten von einem Kartenstapel
     * bis eine gewünschte Karte gezogen wird
     * und gibt danach alle gezogenen Karten in umgekehrter Reihenfolge wieder aus.
     *
     * @param deck              der Kartenstapel von dem die Karten gezogen werden.
     * @param candidateCard          die gewünschte Karte, die die Ziehung beendet.
     * @param dbgOutputEnable   true schaltet Kontrollausgabe an und false aus.
     */
    public void reverseOrder(Deck deck, Card candidateCard, boolean debugOutputEnable) {
        // Aufpassen, dass gültige Parameter reinkommen
        assert candidateCard != null && deck != null : "Deck/Candidate Card may not be null, please specify other parameters";
        
        //Stack über Karten
        Stack<Card> cardStack = new Stack<Card>();
        //boolean prüft ob karte gefunden wurde
        boolean lookingForMatch = true;
        
        //TODO Do while
        while(lookingForMatch) {
            
            //aktuelle Karte wird mit deckdeal gegeben und mit cardstack push auf den stack gepackt
            Card currentCard = deck.deal();
            //wenn die testausgabe wahr ist soll nach hinzufügen jede karte einmal ausgegeben werden
            if(debugOutputEnable) System.out.println("Card: " + currentCard);
            
            cardStack.push(currentCard);
            
            
            // wenn die aktuelle karte gleich dem kandidaten ist, darf man aufhören zu schauen
            if(currentCard.equals(candidateCard)) lookingForMatch = false;    
        }
        //wenn karte gefunden wurde und stack gefüllt ist, soll die oberste karte ausgegeben werden
        while(!cardStack.isEmpty()) System.out.println(cardStack.pop());  
        
    }
}//class
