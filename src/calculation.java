import java.util.Scanner;

public class calculation {
    public static void main(String[] args) {
        int a = 4;

        System.out.println(a++); // a = a + 1
        System.out.println(a++);
        a = a + 10;
        a += 10;
        a *= 10; //a = 10 * a
        System.out.println(a);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstnumber = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        double sumOfSquares = Math.pow(firstnumber, 2) + Math.pow(secondNumber, 2);

        System.out.println("\n");
        System.out.printf("The sum of squares is: %6.2f\n", sumOfSquares); // f = print formatted
    }
}

