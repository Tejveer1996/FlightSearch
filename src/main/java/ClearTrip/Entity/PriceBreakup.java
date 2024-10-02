package ClearTrip.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceBreakup {
    private int pr;

    public int getPr() {
        return pr;
    }

    public void setPr(int pr) {
        this.pr = pr;
    }
}
