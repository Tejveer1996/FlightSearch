package Paytm.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Body {
    private OnwardFlights onwardflights;

//    @Override
//    public String toString() {
//        return "Body{" +
//                "onwardflights=" + onwardflights.getFlights() +
//                '}';
//    }

    public OnwardFlights getOnwardflights() {
        return onwardflights;
    }

    public void setOnwardflights(OnwardFlights onwardflights) {
        this.onwardflights = onwardflights;
    }

    // Getters and Setters
}
