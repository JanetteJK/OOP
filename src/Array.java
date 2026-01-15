import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args ) {
        ArrayList<Integer> t = new ArrayList(); //the list needs a type description <type>
        Scanner input = new Scanner(System.in);

        while (true){
            int num = input.nextInt();
            if (num < 0)
                break;
            t.add(num); // add = append
        }
        for (Integer integer : t) { // size tells how many objects list has
            System.out.println(integer);
        }
    }
}
