package ClearTrip.Entity;

import ClearTrip.Entity.Card;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CardsResponse {
    private List<List<Card>> cards;
    private FilterData filterData;

    public List<List<Card>> getCards() {
        return cards;
    }

    public void setCards(List<List<Card>> cards) {
        this.cards = cards;
    }

    public FilterData getFilterData() {
        return filterData;
    }

    public void setFilterData(FilterData filterData) {
        this.filterData = filterData;
    }
}


