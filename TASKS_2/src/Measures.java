import java.util.Scanner;

public class Measures {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a weight in grams: ");
        double grams = scanner.nextDouble();

        /*
        luoti = 13.28 grammaa
        naula = 32 luotia
        leiviska = 20 naulaa
        */

        double gramsInLuoti = grams / 13.28;
        double luotiInNaula = gramsInLuoti / 32;
        double naulaInLeiviska = luotiInNaula / 20;

        System.out.println(grams + " grams is " +(int)naulaInLeiviska+ " leiviskää, "
                +(int)luotiInNaula%20+ " naulaa and " +gramsInLuoti%32+ "luotia");
    }
}
