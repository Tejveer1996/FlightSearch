package ClearTrip;

public class ClearTripData {
    private String flightOperator;
    private String flightNumber;
    private int clearTripPrice;

    @Override
    public String toString() {
        return flightOperator + "   ;   " + flightNumber + "   ;   "+ clearTripPrice;
    }

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

    public int getClearTripPrice() {
        return clearTripPrice;
    }

    public void setClearTripPrice(int clearTripPrice) {
        this.clearTripPrice = clearTripPrice;
    }
}
