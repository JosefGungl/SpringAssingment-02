package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.ShippingPolicy;

import java.util.List;

public class FreeShippingPolicy implements ShippingPolicy {


    @Override
    public void applyShipping(List<Sale> sales) {
        for(Sale sale: sales)
            sale.setShippingCost(0);
    }
}
