package Paytm.Controller;

import Paytm.Entity.Flight;
import Paytm.Entity.FlightResponse;
import Paytm.Entity.Hop;
import Paytm.PaytmData;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.net.ssl.HttpsURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaytmConnection {
    private static final String API_URL = "https://travel.paytm.com/api/flights/v3/search?origin=BLR&destination=DEL&accept=combination&adults=1&children=0&infants=0&class=E&isH5=true&enable=%7B%22handBaggageFare%22%3Atrue%2C%22paxWiseConvFee%22%3Atrue%2C%22minirules%22%3Atrue%7D&client=web&departureDate=";
            String date = "20241005" ;
            String endpoint = "&userType=null&cohort=null&productFlow=null";

    public List<PaytmData> connection(String date){
        String newDate = removeSlashFromDate(date);

        String url = API_URL+newDate+endpoint;
        List<PaytmData> paytmDataList = new ArrayList<>();

        try {
            URL urlObj = new URL(url);
            HttpsURLConnection connection = (HttpsURLConnection) urlObj.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpsURLConnection.HTTP_OK) {
                Scanner scanner = new Scanner(connection.getInputStream());
                StringBuilder sb = new StringBuilder();
                while(scanner.hasNext()){
                    sb.append(scanner.nextLine());
                }
                ObjectMapper objectMapper = new ObjectMapper();
                FlightResponse flightResponse = objectMapper.readValue(sb.toString(),new TypeReference<FlightResponse>(){});
                List<Flight> flights = flightResponse.getBody().getOnwardflights().getFlights();

                for (Flight flight : flights){
                    PaytmData paytmData = new PaytmData();
                    Hop hop = flight.getHops().get(0);
                    if (!flight.getDestination().equals(hop.getDestination())){
                        continue;
                    }else {
                        paytmData.setFlightOperator(flight.getAirline());
                        paytmData.setFlightNumber(flight.getAirlineCode()+"-"+hop.getFlightNumber());
                        paytmData.setPricePaytm(flight.getPrice().get(0).getPrice());
                        paytmDataList.add(paytmData);
                    }
                }
//                System.out.println("flightOperator      ;    flightNumber   ;     pricePaytm ");
//                for (PaytmData paytmData : paytmDataList){
//                    System.out.println(paytmData);
//                }

            } else {
                System.out.println("Failed to fetch data. Status code: " + responseCode);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return paytmDataList;
    }

    private String removeSlashFromDate(String date) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<date.length(); i++){
            char ch = date.charAt(i);
            if(ch!='/'){
                sb.append(ch);
            }
        }
        return sb.toString();
    }

}

