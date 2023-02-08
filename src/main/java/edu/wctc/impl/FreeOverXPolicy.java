package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.ShippingPolicy;

import java.util.List;

public class FreeOverXPolicy implements ShippingPolicy {
    double min;

    public FreeOverXPolicy(double value){
        this.min = value;
    }

    @Override
    public void applyShipping(List<Sale> sales) {
        new FlatRatePolicy().applyShipping(sales);

        for(Sale sale: sales)
            if (sale.getPrice() >= min){
                sale.setShippingCost(0);
            }
    }

}
