package Paytm.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Hop {
    private String aircraftTypeDisplayName;
    private String provider;
    private String flightNumber;
    private String origin;
    private String destination;
    private String airlineCode;
    private String airline;
    private String operatingAirlineCode;
    private String operatingAirline;
    private String origin_city;
    private String destination_city;

    @Override
    public String toString() {
        return "Hop{" +
                "aircraftTypeDisplayName='" + aircraftTypeDisplayName + '\'' +
                ", provider='" + provider + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", airlineCode='" + airlineCode + '\'' +
                ", airline='" + airline + '\'' +
                ", operatingAirlineCode='" + operatingAirlineCode + '\'' +
                ", operatingAirline='" + operatingAirline + '\'' +
                ", origin_city='" + origin_city + '\'' +
                ", destination_city='" + destination_city + '\'' +
                '}';
    }

    public String getAircraftTypeDisplayName() {
        return aircraftTypeDisplayName;
    }

    public void setAircraftTypeDisplayName(String aircraftTypeDisplayName) {
        this.aircraftTypeDisplayName = aircraftTypeDisplayName;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getOperatingAirlineCode() {
        return operatingAirlineCode;
    }

    public void setOperatingAirlineCode(String operatingAirlineCode) {
        this.operatingAirlineCode = operatingAirlineCode;
    }

    public String getOperatingAirline() {
        return operatingAirline;
    }

    public void setOperatingAirline(String operatingAirline) {
        this.operatingAirline = operatingAirline;
    }

    public String getOrigin_city() {
        return origin_city;
    }

    public void setOrigin_city(String origin_city) {
        this.origin_city = origin_city;
    }

    public String getDestination_city() {
        return destination_city;
    }

    public void setDestination_city(String destination_city) {
        this.destination_city = destination_city;
    }

// Getters and Setters
}
