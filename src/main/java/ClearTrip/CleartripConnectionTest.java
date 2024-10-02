package ClearTrip;

import org.jsoup.Jsoup;
import org.jsoup.Connection;

import java.util.Map;

public class CleartripConnectionTest {
    public static void main(String[] args) {
        String url = "https://www.cleartrip.com/node/flight/search?adults=1&childs=0&infants=0&class=Economy&airline=&carrier=&sd=1727853770416&page=&sellingCountry=IN&ssfi=&flexi_search=&ssfc=&origin=DEL%20-%20New%20Delhi,%20IN&destination=BLR%20-%20Bangalore,%20IN&intl=n&sft=&depart_date=04/10/2024&return_date=&from=DEL&to=BLR";

        try {
            Connection.Response response = Jsoup.connect(url)
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36")
                    .timeout(30000)
                    .ignoreContentType(true)
                    .execute();

            System.out.println("Connection established successfully.");
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Status Message: " + response.statusMessage());
            System.out.println("Content Type: " + response.contentType());

            System.out.println("\nResponse Headers:");
            for (Map.Entry<String, String> header : response.headers().entrySet()) {
                System.out.println(header.getKey() + ": " + header.getValue());
            }

            System.out.println("\nFirst 1000 characters of the response body:");
            String bodyPreview = response.body().substring(0, Math.min(response.body().length(), 1000));
            System.out.println(bodyPreview);

        } catch (Exception e) {
            System.out.println("An error occurred while connecting to the page: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
