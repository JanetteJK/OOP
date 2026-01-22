import java.util.Scanner;
public class HypotenuseCalc {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give me the length of a triangle leg: ");
        int leg1 = scanner.nextInt();

        System.out.print("Give me the length the other triangle leg: ");
        int leg2 = scanner.nextInt();

        double hyp = Math.sqrt(Math.pow(leg1, 2) + Math.pow(leg2, 2));

        System.out.println("The length of the hypotenuse is: " + hyp);

    }
}
