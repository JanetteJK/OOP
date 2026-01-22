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

        //System.out.printf("%.2f grams is %.0f leiviskää, %.0f naulaa, and %.2f luotia",
               // grams, (int)naulaInLeiviska, (int)luotiInNaula%20, gramsInLuoti%32

        System.out.printf(grams + " grams is " +(int)naulaInLeiviska+ " leiviskää, "
                +(int)luotiInNaula%20+ " naulaa and %.2f luotia", gramsInLuoti%32);


    }
}
