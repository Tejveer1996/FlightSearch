package Paytm.Entity;

import Paytm.Entity.Body;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightResponse {
    private Body body;

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "FlightResponse{" +
                "body=" + body.getOnwardflights().getFlights() +
                '}';
    }

    // Getters and Setters
}
