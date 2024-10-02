package ClearTrip.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Fare {
    private String solutionId;
    private PerAdultPricing per_adult_pricing;

    public String getSolutionId() {
        return solutionId;
    }

    public void setSolutionId(String solutionId) {
        this.solutionId = solutionId;
    }

    public PerAdultPricing getPer_adult_pricing() {
        return per_adult_pricing;
    }

    public void setPer_adult_pricing(PerAdultPricing per_adult_pricing) {
        this.per_adult_pricing = per_adult_pricing;
    }
}
