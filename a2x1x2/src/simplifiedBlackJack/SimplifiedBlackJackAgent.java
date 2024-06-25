// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package simplifiedBlackJack;


import cards.*;
import cards.Card.*;
import static cards.Card.*;
import static cards.Card.Constant.*;


/**
 * Simplified Black Jack Agent - see task
 * 
 * @author  Fenja, Laurin
 * @version 20240508v1
 */
public class SimplifiedBlackJackAgent {
    
    // Ersetzen Sie diesen Kommentar durch Ihren Code
    // oder falls kein Code noetig ist, loeschen diesen Kommentar einfach.
    // Hier waere die Stelle fuer moegliche Zustandsvariablen, Exemplarvariablen
    // bzw. Objekt-spezifische Variablen oder einen Konstruktor,
    // sofern derartiges benoetigt wird.
    // Es ist Ihre Entscheidung und sie sollte Sinn machen.
    
    
    
    /**
     * "Play" Black Jack
     */
    public void playBlackJack(){

        //Deklaration und Initialisierung
        Deck deck = new Deck();
        Card card;
        int points = 0;
        
        do {
            card = deck.deal(); //neue Karte wird zugeteilt
            final Rank cardRank = card.getRank();
            switch (cardRank) { //entsprechende Punkte werden addiert
                case ACE: points +=11;break;
                case JACK, QUEEN, KING : points += 10;break;
                default : points += cardRank.value();
                /*
                Hier nicht nötig, da Texas Hold'em
                default:
                    assert false: "Card does not exist";
                */
            }
            
            System.out.println(card.toString() + points);

        } while (points<17); 
            
        
        if (points>21) {
            System.out.println("Lost");
        }
        //...
        
        
        
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        // Sofern Sie kein Vorwissen haben und/oder NICHT wissen was Sie tun
        // führen Sie KEINE! Änderungen unterhalb dieser Zeilen durch.
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        System.out.flush();
    }//method()
    
}//class
