package Model;

import java.util.ArrayList;
import java.util.Currency;

public class Converter {
    private String abbrev;
    private String name;
    private double convRate;
    private ArrayList<Converter> currencies = new ArrayList<>();

    public Converter(String abbreviation, String name, double convRate){
        this.abbrev = abbreviation;
        this.name = name;
        this.convRate = convRate;

    }

    public void addCurrency(String a, String n, double c){
        Converter money = new Converter(a, n, c);
        currencies.add(money);
    }

    public double getConversion(double amount){
        return (amount*this.convRate);
    }

}
