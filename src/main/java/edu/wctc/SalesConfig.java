package edu.wctc;

import edu.wctc.iface.SalesInput;
import edu.wctc.iface.SalesReport;
import edu.wctc.iface.ShippingPolicy;
import edu.wctc.impl.FileInput;
import edu.wctc.impl.FlatRatePolicy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class SalesConfig {
    @Bean
    public SalesInput salesInput() {
        return new FileInput();
    }

    @Bean
    public SalesReport salesReport() {
        return new edu.wctc.impl.SalesReport();
    }

    @Bean
    public ShippingPolicy shippingPolicy(){return new FlatRatePolicy();
    }

}