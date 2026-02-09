import java.util.ArrayList;

public class ParallelNumSum extends Thread {
    private ArrayList<Integer> array;
    private int first;
    private int last;
    private int sum;

    public ParallelNumSum(ArrayList<Integer> in, int first, int last) {
        this.array = in;
        this.first = first;
        this.last = last;
        this.sum = 0;
    }

    public void addSum(int amount){
        this.sum = amount;
    }

    public int getSum(){
        return this.sum;
    }


    public void run() {
        int sum = 0;
        for (int i = first; i <= last; i++) {
            sum += array.get(i);
        }
        System.out.println("Threads sum was: " +sum);
        addSum(sum);

    }
}
class Main {

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        ArrayList<Integer> array = new ArrayList<>();
        int size = 20;
        for (int i = 0; i < 10000; i++) {
            double num = Math.random() * 10;
            array.add((int) num);
        }

        ParallelNumSum t1 = new ParallelNumSum(array, 0, size - 1);
        ParallelNumSum t2 = new ParallelNumSum(array, size, 2 * size - 1);
        ParallelNumSum t3 = new ParallelNumSum(array, 2 * size, 3 * size - 1);
        ParallelNumSum t4 = new ParallelNumSum(array, 3 * size, 4 * size - 1);
        ParallelNumSum t5 = new ParallelNumSum(array, 4 * size, 5 * size - 1);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            return;
        }
        int finalSum = t1.getSum() + t2.getSum() + t3.getSum() + t4.getSum() + t5.getSum();
        System.out.println("The final sum of the array was: " + finalSum);
    }
}
