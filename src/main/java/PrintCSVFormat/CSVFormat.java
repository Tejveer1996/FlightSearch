package PrintCSVFormat;

import ClearTrip.ClearTripData;
import Paytm.PaytmData;

import java.io.LineNumberInputStream;
import java.util.*;

public class CSVFormat {
    public void printCSV(List<PaytmData> paytmDataList, List<ClearTripData> clearTripDataList){
        HashMap<String,String> operatorFlightNumberMap = new HashMap<>();
        for (PaytmData paytmData : paytmDataList){
            operatorFlightNumberMap.put(paytmData.getFlightNumber(),paytmData.getFlightOperator());
        }
        for (ClearTripData clearTripData : clearTripDataList){
            operatorFlightNumberMap.put(clearTripData.getFlightNumber(), clearTripData.getFlightOperator());
        }

        HashMap<String,Integer> flightNumberPaytmPriceMap = new HashMap<>();
        for (PaytmData paytmData : paytmDataList){
            flightNumberPaytmPriceMap.put(paytmData.getFlightNumber(),paytmData.getPricePaytm());
        }
        HashMap<String,Integer> flightNumberClearTripPriceMap = new HashMap<>();
        for (ClearTripData clearTripData : clearTripDataList){
            flightNumberClearTripPriceMap.put(clearTripData.getFlightNumber(),clearTripData.getClearTripPrice());
        }

        System.out.println("FlightOperator   ;   "+"FlightNumber    ;   "+"paytmPrice    ;   " +"clearTripPrice");

        for (Map.Entry<String,String> map : operatorFlightNumberMap.entrySet()){
            String operator = map.getValue();
            String flightNumber = map.getKey();
            String paytmPrice = "Not found";
            if (flightNumberPaytmPriceMap.containsKey(flightNumber)){
                paytmPrice = Integer.toString(flightNumberPaytmPriceMap.get(flightNumber));
            }
            String clearTripPrice = "Not Found";
            if (flightNumberClearTripPriceMap.containsKey(flightNumber)){
                clearTripPrice = Integer.toString(flightNumberClearTripPriceMap.get(flightNumber));
            }

            System.out.println(operator+"   ;  "+flightNumber+"    ;  "+paytmPrice+"    ;  "+clearTripPrice);
        }
    }
}
