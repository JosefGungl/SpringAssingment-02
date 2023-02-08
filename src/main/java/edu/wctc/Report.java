package edu.wctc;

import edu.wctc.iface.SalesInput;
import edu.wctc.iface.SalesReport;
import edu.wctc.iface.ShippingPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class Report {
    private SalesReport salesReport;
    private SalesInput salesInput;
    private ShippingPolicy shippingPolicy;


@Autowired
    public Report (SalesInput salesInput, SalesReport salesReport, ShippingPolicy shippingPolicy) {
     this.salesInput = salesInput;
     this.salesReport = salesReport;
     this.shippingPolicy = shippingPolicy;
}

    public void run() {
    List<Sale> sales = salesInput.getSales();
    shippingPolicy.applyShipping(sales);
    salesReport.generateReport(sales);
    }

}
