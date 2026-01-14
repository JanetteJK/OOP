import java.sql.SQLOutput;
import java.util.Scanner;
public class FCConv {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me the temperature in Fahrenheit: ");
        double fah = scanner.nextDouble();
        double cel = (fah - 32)/1.8;

        System.out.println(fah +" Fahrenheit is " + cel + " Celsius");
    }
}
