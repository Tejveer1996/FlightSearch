package ClearTrip.Connection;

import ClearTrip.Entity.Card;
import ClearTrip.Entity.CardsResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.net.ssl.HttpsURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClearTripConnection {
    private static final String ClearTrip_API_URL = "https://www.cleartrip.com/node/flight/search?adults=1&childs=0&infants=0&class=Economy&airline=&carrier=&sd=1727842945790&page=&sellingCountry=IN&ssfi=&flexi_search=&ssfc=&origin=DEL%20-%20New%20Delhi,%20IN&destination=BLR%20-%20Bangalore,%20IN&intl=n&sft=&depart_date=04/10/2024&return_date=&from=DEL&to=BLR";
    public void connection(){
        try {
                URL urlObj = new URL(ClearTrip_API_URL);
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
                CardsResponse cardsResponse = objectMapper.readValue(sb.toString(),new TypeReference<CardsResponse>(){});
                List<Card> card = cardsResponse.getCards().get(0);
                System.out.println(card);

            } else {
                System.out.println("Failed to fetch data. Status code: " + responseCode);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
