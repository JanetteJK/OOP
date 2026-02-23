package Model;

public class Converter {
    private String abbrev;
    private String name;
    private double convRate;

    public Converter(String abbreviation, String name, double convRate){
        this.abbrev = abbreviation;
        this.name = name;
        this.convRate = convRate;

    }

    public double getConversion(double amount){
        return (amount*this.convRate);
    }

}
