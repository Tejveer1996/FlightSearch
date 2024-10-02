package ClearTrip.Entity;

import ClearTrip.Entity.Card;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CardsResponse {
    private List<List<Card>> cards;

    // Getters and setters
    public List<List<Card>> getCards() {
        return cards;
    }

    public void setCards(List<List<Card>> cards) {
        this.cards = cards;
    }
}


