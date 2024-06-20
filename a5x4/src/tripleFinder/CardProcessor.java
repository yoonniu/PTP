package tripleFinder;

import cards.Card;
import cards.Card.Rank;
import java.util.ArrayList;
import java.util.*;

public class CardProcessor implements CardProcessor_I {

    //create map to save cards
    //Name of the card is the key and saved as Rank and amount of cards is saved as Arraylist
    private Map<Rank,Collection<Card>> cardsMap = new HashMap<Rank,Collection<Card>>();

    //constructor without parameters
    public CardProcessor() {
        cardsMap = new HashMap<Rank,Collection<Card>>(); //creates empty map
    }

    @Override
    public Object process(Card card) {
        assert card != null : "Card is not valid"; //check if card is valid 
        
        Rank currentRank = card.getRank();
        //get collection (arraylist) of current rank 
        Collection<Card> rankCollection = cardsMap.get(currentRank); 
        
        //if Rank of currentCard is in HashMap 
        if (cardsMap.containsKey(currentRank)) {
            
            rankCollection.add(card); //add card to collection
            
        }else{
            //add key to map and create new arraylist to store cards of rank
            rankCollection = new ArrayList<>(); //create new arraylist 
            rankCollection.add(card);
            cardsMap.put(currentRank, rankCollection); //put key and value in map
        }

        //if arraylist has 3 cards -> return the three cards
        if (rankCollection.size() >= 3) return rankCollection;
        
    return null;
}

    //Hashmap leeren
    @Override
    public void reset() {
        cardsMap.clear();
    }

}
