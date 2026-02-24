package Controller;

import Model.Converter;

public class ConverterController {
    Converter usd = new Converter("USD", "Dollar", 1.18); //current cnvert rates
    Converter eur = new Converter("EUR", "Euro", 0.81);


    public double getEurToUsd(double amount){
        return usd.getConversion(amount);
    }

    public double getUsdToEur(double amount){
        return eur.getConversion(amount);
    }

}
