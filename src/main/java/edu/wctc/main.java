package edu.wctc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(SalesConfig.class);
        context.refresh();

        ((Report)context.getBean("report")).run();
    }
}
