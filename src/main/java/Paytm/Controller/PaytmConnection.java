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
    public void connection(String API_URL){
        try {
            URL urlObj = new URL(API_URL);
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
                List<PaytmData> paytmDataList = new ArrayList<>();
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
                System.out.println("flightOperator      ;    flightNumber   ;     pricePaytm ");
                for (PaytmData paytmData : paytmDataList){
                    System.out.println(paytmData);
                }

            } else {
                System.out.println("Failed to fetch data. Status code: " + responseCode);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

