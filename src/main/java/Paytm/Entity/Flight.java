package Paytm.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Flight {
    private String origin;
    private String originCity;
    private String destination;
    private String destinationCity;
    private String bookingClass;
    private String airline;
    private String airlineCode;
    private List<Hop> hops;
    private boolean refundable;
    private String flightid;
    private List<Price> price;

    @Override
    public String toString() {
        return "Flight{" +
                "origin='" + origin + '\'' +
                ", originCity='" + originCity + '\'' +
                ", destination='" + destination + '\'' +
                ", destinationCity='" + destinationCity + '\'' +
                ", bookingClass='" + bookingClass + '\'' +
                ", airline='" + airline + '\'' +
                ", airlineCode='" + airlineCode + '\'' +
                ", hops=" + hops +
                ", refundable=" + refundable +
                ", flightid='" + flightid + '\'' +
                ", price=" + price +
                '}';
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOriginCity() {
        return originCity;
    }

    public void setOriginCity(String originCity) {
        this.originCity = originCity;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public String getBookingClass() {
        return bookingClass;
    }

    public void setBookingClass(String bookingClass) {
        this.bookingClass = bookingClass;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public List<Hop> getHops() {
        return hops;
    }

    public void setHops(List<Hop> hops) {
        this.hops = hops;
    }

    public boolean isRefundable() {
        return refundable;
    }

    public void setRefundable(boolean refundable) {
        this.refundable = refundable;
    }

    public String getFlightid() {
        return flightid;
    }

    public void setFlightid(String flightid) {
        this.flightid = flightid;
    }

    public List<Price> getPrice() {
        return price;
    }

    public void setPrice(List<Price> price) {
        this.price = price;
    }
    // Getters and Setters
}
