import java.util.Scanner;

public class nameGenerator {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String[] name = {"Jarkko", "Maria", "Juan", "Timo", "Liisa"};
        String[] lastName = {"Matinen", "Rizz", "Parkkila", "Konttila", "Mielinen"};

        System.out.println("How many names would you like me to generate?\n");
        int ans = scanner.nextInt();

        int names = 0;
        while (names < ans){
            int val = (int) (Math.random() * 5);
            int val2 = (int) (Math.random() * 5);
            System.out.print(name[val] + " " + lastName[val2] + "\n");
            names = names + 1;
        }

    }
}