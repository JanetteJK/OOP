import java.util.Scanner;

public class QuadraticEqSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r1,r2;
        System.out.print("Give the value of a: ");
        int a = scanner.nextInt();
        System.out.print("Give the value of b: ");
        int b = scanner.nextInt();
        System.out.print("Give the value of c: ");
        int c = scanner.nextInt();

        int formula = (b*b) - (4*a*c);

        if (formula == 0){
            r1 = r2 = -b / (2*a);
            System.out.println("The roots are: " + r1 + " and " + r2);
        }
        else if (formula > 0) {
            r1 = (-b + Math.sqrt(formula)) / (2*a);
            r2 = (-b - Math.sqrt(formula)) / (2*a);
            System.out.println("The roots are: " + r1 + " and " + r2 );
        }
        else {
            System.out.println("No real roots!");
        }

    }
}