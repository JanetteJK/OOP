public class NumbersThread extends Thread {
    private int numbers;
    private String type;

    public NumbersThread(int range, String evenOrOdd) {
        numbers = range;
        type = evenOrOdd;

    }

    public void run() {
        try {
            for (int i = 0; i < numbers; i++) {
                if (i % 2 != 0 && type.equals("odd")) {
                    System.out.println("Odd thread: " + i);
                }
                if (i % 2 == 0 && type.equals("even")) {
                    System.out.println("Even thread: " + i);
                    Thread.sleep(50);
                }
            }
        } catch (InterruptedException e) {
            return;
        }
    }

    public static void main(String[] args) {
        new NumbersThread(20, "odd").start();
        new NumbersThread(20, "even").start();
    }
}