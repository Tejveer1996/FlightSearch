package ClearTrip.Controller;

import ClearTrip.ClearTripData;
import ClearTrip.Entity.Card;
import ClearTrip.Entity.CardsResponse;
import ClearTrip.Entity.Option;
import Paytm.PaytmData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ClearTripController {
    public List<ClearTripData> controller(CardsResponse cardsResponse){
        List<ClearTripData> clearTripDataArrayList = new ArrayList<>();

        HashMap<String,String> airLineCodeMap = new HashMap<>();
        List<Option> optionList = cardsResponse.getFilterData().getAirlineFilter().getOptions();
        for (Option option: optionList){
            airLineCodeMap.put(option.getValue(), option.getLabel());
        }


        List<Card> cards = cardsResponse.getCards().get(0);

        for (Card card : cards){
            if (card.getMaxStopsInSectors()==0){
                ClearTripData clearTripData = new ClearTripData();
                clearTripData.setFlightNumber(card.getAirlineCodes().get(0)+"-"+card.getSplRtFn());
                clearTripData.setFlightOperator(airLineCodeMap.get(card.getAirlineCodes().get(0)));
                clearTripData.setClearTripPrice(card.getPriceBreakup().getPr());

                clearTripDataArrayList.add(clearTripData);
            }

        }

//        System.out.println("flightOperator      ;    flightNumber   ;     priceClearTrip ");
//        for (ClearTripData clearTripData : clearTripDataArrayList){
//            System.out.println(clearTripData);
//        }

        return clearTripDataArrayList;
    }
}
