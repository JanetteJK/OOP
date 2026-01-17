import java.util.Scanner;

public class Measures {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a weight in grams: ");
        double grams = scanner.nextDouble();

        double luoti = 13.28;
        double naula = luoti *= 32;
        double leiviska = grams /= (naula *= 20);




        System.out.println(grams + " grams is " +leiviska+ " leiviskää, " +naula+ " naulaa and " +luoti+ "luotia");
    }
}
