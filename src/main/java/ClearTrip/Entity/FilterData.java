package ClearTrip.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FilterData {
    private AirlineFilter airlineFilter;

    public AirlineFilter getAirlineFilter() {
        return airlineFilter;
    }

    public void setAirlineFilter(AirlineFilter airlineFilter) {
        this.airlineFilter = airlineFilter;
    }
}
