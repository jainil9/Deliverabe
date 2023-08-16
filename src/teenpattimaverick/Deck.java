
package teenpattimaverick;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private final List<String> collectionCards = new ArrayList<>();

    public Deck() {
        initializeDeck();
    }

    public void shuffle() {
        Collections.shuffle(collectionCards);
    }

    public List<String> getCollectionCards() {
        return collectionCards;
    }

    private void initializeDeck() {
        Suits[] suits = Suits.values();
        Cards[] cards = Cards.values();

        for (Suits suit : suits) {
            for (Cards card : cards) {
                collectionCards.add(suit.getSymbol() + card.getCardName());
            }
        }
    }
}
