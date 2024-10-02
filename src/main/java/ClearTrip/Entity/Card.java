package ClearTrip.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Card {
    private List<String> airlineCodes;
    private String splRtFn;

    public List<String> getAirlineCodes() {
        return airlineCodes;
    }

    public void setAirlineCodes(List<String> airlineCodes) {
        this.airlineCodes = airlineCodes;
    }

    public String getSplRtFn() {
        return splRtFn;
    }

    public void setSplRtFn(String splRtFn) {
        this.splRtFn = splRtFn;
    }
}
