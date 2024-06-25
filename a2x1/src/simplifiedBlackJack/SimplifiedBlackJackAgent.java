// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package simplifiedBlackJack;


import cards.*;
import cards.Card.*;
import static cards.Card.*;
import static cards.Card.Constant.*;


/**
 * Simplified Black Jack Agent - see task
 * 
 * @author  (your name(s)) 
 * @version (a version number or a date)
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
        //VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
        //###
        //###
        //###
        //###           HIER kommt Ihr Code hin
        //###
        //###                    VVVV
        //###                    VVVV
        //###                    VVVV
        //###   VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
        //###      VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
        //###         VVVVVVVVVVVVVVVVVVVVVVVVVV
        //###            VVVVVVVVVVVVVVVVVVVV
        //###               VVVVVVVVVVVVVV
        //###                  VVVVVVVV
        //###                     VV
        Deck deck = new Deck();
        Card card;
        int points = 0;
        
        do {
            card = deck.deal(); //neue Karte wird zugeteilt
            
            switch (card.getRank()) { //entsprechende Punkte werden addiert
                case ACE: points +=11;break;
                case JACK: points += 10;break;
                case KING: points += 10;break;
                case QUEEN: points += 10;break;
                case TWO: points +=2; break;
                case THREE: points +=3; break;
                case FOUR: points +=4; break;
                case FIVE: points +=5; break;
                case SIX: points +=6; break;
                case SEVEN: points +=7; break;
                case EIGHT: points +=8; break;
                case NINE: points +=9; break;
                case TEN: points +=10; break;
                default:
                    System.out.println("Card does not exist");
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
