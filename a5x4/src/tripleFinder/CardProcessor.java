package tripleFinder;

import cards.Card;
import cards.Card.Rank;
import java.util.ArrayList;
import java.util.List;

public class CardProcessor implements CardProcessor_I {
    private List<Card> cards; //store all cards
    private List<Rank> ranks; //store the ranks of the cards
    private int cardCounter; //amount of cards

    //constructor without parameters
    public CardProcessor() {
        cards = new ArrayList<>();
        ranks = new ArrayList<>();
        cardCounter = 0;
    }
    
    //process method
    @Override
    public Object process(Card card) {
        assert card != null: "Karte ist null";
        if (cardCounter >= 52) { //if cards are empty > reset
            reset();
        }

        //add cards and their rank to the lists
        cards.add(card); 
        ranks.add(card.getRank());
        cardCounter++;

        int firstIndex = ranks.indexOf(card.getRank()); //find card in list with same rank
        int lastIndex = ranks.lastIndexOf(card.getRank()); //to create sublist and compare ranks

        if (lastIndex != firstIndex && firstIndex != -1) { //must have same rank and firstindex must exist
            
            //find second card in list with same rank
            List<Rank> subList = ranks.subList(firstIndex + 1, lastIndex);
            int subListSecondIndex = subList.indexOf(card.getRank());
            int secondIndex = (subListSecondIndex != -1) ? subListSecondIndex + firstIndex + 1 : -1;
            //ranks. > Liste die wir uns angucken
                            //subList > Ausschnitt den wir uns angucken
                            //indexOf > Methode um den Index der 2. Karte zu bekommen (aber nur Index der Unterliste)
                                     // > + firstIndex + 1 um tatsächlichen Index herauszufinden
            
            if (secondIndex != -1) { //check if secondindex exists
                return String.format("%s, %s, %s", 
                        cards.get(firstIndex), 
                        cards.get(secondIndex), 
                        card);
            }
        }

        return null;
    }

    @Override
    public void reset() {
        cards.clear();
        ranks.clear();
        cardCounter = 0;
    }
}
