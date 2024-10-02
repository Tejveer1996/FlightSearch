package ClearTrip.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AirlineFilter {
    private List<Option> options;

    // Getter
    public List<Option> getOptions() {
        return options;
    }

    // Setter
    public void setOptions(List<Option> options) {
        this.options = options;
    }
}
