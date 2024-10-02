package Paytm.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Price {
    private int price;
    private int totalfare;

    @Override
    public String toString() {
        return "Price{" +
                "price=" + price +
                ", totalfare=" + totalfare +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotalfare() {
        return totalfare;
    }

    public void setTotalfare(int totalfare) {
        this.totalfare = totalfare;
    }
// Getters and Setters
}
