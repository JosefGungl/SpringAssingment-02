package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.ShippingPolicy;

import java.util.List;

public class FlatRatePolicy implements ShippingPolicy {

    @Override
    public void applyShipping(List<Sale> sales) {
        double shipping;
        for(Sale sale: sales){
            switch(sale.getCountry().toLowerCase()){
                case "united states","usa","us" -> shipping = 29.95;
                case "japan" -> shipping = 14.50;
                case "scotland" -> shipping = 7.56;
                case "india" -> shipping = 11.79;
                default -> {
                    throw new IllegalArgumentException("invalid country");
                }
            }
            sale.setShippingCost(shipping);
        }
    }
}


