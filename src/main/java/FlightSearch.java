import ClearTrip.ClearTripData;
import ClearTrip.Connection.ClearTripConnection;
import ClearTrip.Controller.ClearTripController;
import Paytm.Controller.PaytmConnection;
import Paytm.PaytmData;
import PrintCSVFormat.CSVFormat;

import java.util.List;
import java.util.Scanner;

public class FlightSearch {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Date in YYYY/MM/DD format : ");
        String str= sc.nextLine();

        PaytmConnection paytmConnection = new PaytmConnection();
        List<PaytmData> paytmDataList =  paytmConnection.connection(str);

        ClearTripConnection clearTripConnection = new ClearTripConnection();
        List<ClearTripData> clearTripDataList =  clearTripConnection.connection(str);

        CSVFormat csvFormat = new CSVFormat();
        csvFormat.printCSV(paytmDataList,clearTripDataList);

    }



}