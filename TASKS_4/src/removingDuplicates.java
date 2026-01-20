import java.util.Scanner;

public class removingDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What size Array would you like? ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int[] uniqueNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter integer: ");
            int num = scanner.nextInt();
            numbers[i] = num;
        }
        int uniqueInx = 0;
        for (int j = 0; j < numbers.length; j++){
            boolean isDuplicate = false;

            for (int k = 0; k < uniqueInx; k++){
                if (numbers[j] == uniqueNumbers[k]){
                    isDuplicate = true;
                    break;
                }

            }
            if (!isDuplicate){
                uniqueNumbers[uniqueInx] = numbers[j];
                uniqueInx++;
            }
        }
        System.out.println("The array without duplicates: ");
        for (int i = 0; i < uniqueInx; i++){
            System.out.print(uniqueNumbers[i] + " ");
        }


    }
}