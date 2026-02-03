import java.io.*;
import java.util.ArrayList;

public class FibonacciGen {
    int maxNumber;
    long prevNumber;
    long nextNumber;
    //ArrayList<Long> numbers = new ArrayList<Long>();

    public FibonacciGen(int maxNumber) {
        this.prevNumber = 0;
        this.nextNumber = 1;
        this.maxNumber = maxNumber;

        try {
            Writer writer = new FileWriter("TASKS_3.4/src/Fibonaccinumber.csv");
        for (int i = 0; i <= maxNumber; i++) {
            //numbers.add(prevNumber);
            writer.write(String.valueOf((long) this.prevNumber +"\n"));
            writer.flush();
            long number = this.prevNumber + this.nextNumber;
            System.out.println(prevNumber);
            this.prevNumber = nextNumber;
            this.nextNumber = number;


        }
            }catch(IOException e){
            e.printStackTrace();
        }


    }

        public static void main (String[]args){
        new FibonacciGen(60);


    }

}
