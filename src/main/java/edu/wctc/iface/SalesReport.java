package edu.wctc.iface;

import java.util.List;
import edu.wctc.Sale;

public interface SalesReport {
    void generateReport (List<Sale> salesList);
}
