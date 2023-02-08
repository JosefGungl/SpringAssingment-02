package edu.wctc;

public class Sale {
    private String name, country;
    private double price, tax, shippingCost;

    public Sale(String name, String country, double price, double tax) {
        this.name = name;
        this.country = country;
        this.price = price;
        this.tax = tax;
        this.shippingCost = 0;
    }

    //getters
    public String getName() { return name; }
    public String getCountry() { return country; }
    public double getPrice() { return price; }

    public void setShippingCost(double shippingCost) { this.shippingCost = shippingCost; }

    public String toString() {
        return "Name: "+name+ "     Country: "+country+
                "     Price: "+price+"     Tax: "+tax+
                "     Shipping Cost: "+shippingCost;
    }
}
