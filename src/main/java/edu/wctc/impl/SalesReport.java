package edu.wctc.impl;

import edu.wctc.Sale;

import java.util.List;

public class SalesReport implements edu.wctc.iface.SalesReport {


    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println("-- -- Sales Report -- --");
        for (Sale sale: salesList){
            System.out.println(sale.toString());
        }
    }
}
