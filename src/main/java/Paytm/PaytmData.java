package Paytm;

public class PaytmData {
    private String flightOperator;
    private String flightNumber;
    private int pricePaytm;

    public String getFlightOperator() {
        return flightOperator;
    }

    public void setFlightOperator(String flightOperator) {
        this.flightOperator = flightOperator;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getPricePaytm() {
        return pricePaytm;
    }

    public void setPricePaytm(int pricePaytm) {
        this.pricePaytm = pricePaytm;
    }

    @Override
    public String toString() {
        return  flightOperator  +"    ;   "+ flightNumber +"  ;    "+ pricePaytm ;
    }
}
