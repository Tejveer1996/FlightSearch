package ClearTrip.Connection;

import ClearTrip.ClearTripData;
import ClearTrip.Controller.ClearTripController;
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
    String ClearTrip_API_URL = "https://www.cleartrip.com/node/flight/search?adults=1&childs=0&infants=0&class=Economy&airline=&carrier=&sd=1727889414852&page=&sellingCountry=IN&ssfi=&flexi_search=&ssfc=&origin=BLR%20-%20Bangalore,%20IN&destination=DEL%20-%20New%20Delhi,%20IN&intl=n&sft=&depart_date=";
    String date = "04/10/2024";
    String endpoint = "&return_date=&from=BLR&to=DEL";
    public List<ClearTripData> connection(String givenDate){
        String newDate = reversetheDate(givenDate);
        String url = ClearTrip_API_URL+newDate+endpoint;

        List<ClearTripData> clearTripDataList = new ArrayList<>();
        try {
                URL urlObj = new URL(url);
                HttpsURLConnection connection = (HttpsURLConnection) urlObj.openConnection();
                connection.setRequestMethod("GET");

            // Set headers
              connection.setRequestProperty("referer",url);


            int responseCode = connection.getResponseCode();
            if (responseCode == HttpsURLConnection.HTTP_OK) {
                Scanner scanner = new Scanner(connection.getInputStream());
                StringBuilder sb = new StringBuilder();
                while(scanner.hasNext()){
                    sb.append(scanner.nextLine());
                }
                ObjectMapper objectMapper = new ObjectMapper();
                CardsResponse cardsResponse = objectMapper.readValue(sb.toString(),new TypeReference<CardsResponse>(){});
                ClearTripController controller = new ClearTripController();
                clearTripDataList =  controller.controller(cardsResponse);

            } else {
                System.out.println("Failed to fetch data of clear Trip. Status code: " + responseCode);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return clearTripDataList;
    }

    private String reversetheDate(String date) {
        int slashCount =0;
        String day = "";
        String month="";
        String year="";
        for(int i=0; i<date.length(); i++){
            char ch = date.charAt(i);
            if(ch!='/'&&slashCount==0){
                year = year+ch;
            }else if (ch!='/' && slashCount==1){
                month = month+ch;
            }else if(ch!='/' && slashCount==2){
                day = day+ch;
            } else if (ch=='/') {
                slashCount++;
            }
        }
        return day+"/"+month+"/"+year;
    }

}
