package tripleFinder;

import cards.Card;
import cards.Card.Rank;
import java.util.ArrayList;
import java.util.List;

public class CardProcessor implements CardProcessor_I {
    private List<Card> cards;
    private List<Rank> ranks;
    private int cardCounter;

    //parameterlose Konstruktor
    public CardProcessor() {
        cards = new ArrayList<>();
        ranks = new ArrayList<>();
        cardCounter = 0;
    }

    @Override
    public Object process(Card givenCard) {
        if (cardCounter >= 52) { //if cards are empty > reset
            reset();
        }

        cards.add(givenCard);
        ranks.add(givenCard.getRank());
        cardCounter++;

        int firstIndex = ranks.indexOf(givenCard.getRank());
        int lastIndex = ranks.lastIndexOf(givenCard.getRank());

        if (lastIndex != firstIndex && firstIndex != -1) {
            // Find the second occurrence index
            int secondIndex = ranks.subList(firstIndex + 1, lastIndex).indexOf(givenCard.getRank()) + firstIndex + 1;

            if (secondIndex != -1) {
                return String.format("%s, %s, %s", 
                        cards.get(firstIndex), 
                        cards.get(secondIndex), 
                        givenCard);
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
