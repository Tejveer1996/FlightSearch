import ClearTrip.Connection.ClearTripConnection;
import Paytm.Controller.PaytmConnection;

public class PaytmFlightApiScraper {
    private static final String API_URL = "https://travel.paytm.com/api/flights/v3/search?origin=DEL&destination=BLR&accept=combination&adults=1&children=0&infants=0&class=E&isH5=true&enable=%7B%22handBaggageFare%22%3Atrue%2C%22paxWiseConvFee%22%3Atrue%2C%22minirules%22%3Atrue%7D&client=mweb&departureDate=20241005&userType=null&cohort=null&productFlow=null";

    public static void main(String[] args) {
//        PaytmConnection paytmConnection = new PaytmConnection();
//        paytmConnection.connection(API_URL);

        ClearTripConnection clearTripConnection = new ClearTripConnection();
        clearTripConnection.connection();
    }

}