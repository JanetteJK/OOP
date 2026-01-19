import java.util.Scanner;

public class maximumSubarray {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of integers you want: ");
        int size = scanner.nextInt();
        int [] integers = new int[size];
        for (int i = 0; i < size; i++){
            System.out.println("Enter integer: ");
            int num = scanner.nextInt();
            integers[i] = num;

        }
        for (int i = 0; i < integers.length; i++){
            System.out.println(integers[i]);
        }
        int maxSum = 0;
        int maxSoFar = 0;
        int currentStart = 0;
        int start = 0;
        int end = 0;

        for (int i = 1; i < integers.length; i++){
            if (integers[i] > maxSum + integers[i]) {
                maxSum = integers[i];
                currentStart = i;
            }else {
                maxSum += integers[i];
            }
            if (maxSum > maxSoFar) {
                maxSoFar = maxSum;
                start = currentStart+1;
                end = i+1;
            }

        }
        System.out.println("Maximum sum was: " + maxSoFar);
        System.out.println("Integers: " + start + " - " + end);
    }
}
