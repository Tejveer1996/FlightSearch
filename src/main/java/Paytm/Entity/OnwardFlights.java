package Paytm.Entity;

import Paytm.Entity.Flight;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OnwardFlights {
    private List<Flight> flights;

//    @Override
//    public String toString() {
//        return "OnwardFlights{" +
//                "flights=" + flights +
//                '}';
//    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    // Getters and Setters
}
