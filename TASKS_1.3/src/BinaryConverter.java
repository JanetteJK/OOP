import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("Give me a binary number: \n");

        int num = scanner.nextInt();
        String temp;
        int ans;

        temp = String.valueOf(num);
        System.out.println(temp);
        ans = Integer.parseInt(temp,2);

        System.out.println("Decimal of " + num + " is " + ans);

    }
}
