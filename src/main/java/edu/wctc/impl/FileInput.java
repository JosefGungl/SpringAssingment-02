package edu.wctc.impl;

import edu.wctc.Sale;
import edu.wctc.iface.SalesInput;

import java.util.*;
import java.io.*;

public class FileInput implements SalesInput {


    @Override
    public List<Sale> getSales() {
        List<Sale> sales = new ArrayList<>();
        try{
            File x = new File("C:\\Users\\josef\\IdeaProjects\\spring-assignment\\src\\main\\java\\edu\\wctc\\file\\sales.txt");
            Scanner reader = new Scanner(x);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                List<String> list = Arrays.asList(data.split(","));
                sales.add(new Sale(list.get(0), list.get(1), Double.parseDouble(list.get(2)), Double.parseDouble(list.get(3))));
            }
            reader.close();
        } catch (FileNotFoundException e) {System.out.println("error: file not found"); e.printStackTrace();}
        return sales;
    }

}
