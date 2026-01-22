import java.util.Scanner;

public class PrimeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a positive smaller starting number and a bigger ending number: \n");
        int num = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Prime numbers between " +num+ " and " +num2+ " are: ");
        /*
        System.out.println(num);
        System.out.println(num2);
        */
        for (int n = num; n < num2; n++) {
            boolean prime = true;

            int i = 2;
            while (i <= n / 2) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
                i++;
            }
            if (prime) {
                System.out.print(n + "  ");
            }

        }
    }
}