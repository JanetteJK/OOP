public class Customer {
    private int id;
    private long startTime;
    private long endTime;
    private static int customerCounter = 1;

    public Customer(){
        this.id = customerCounter++;
    }

    public int getId() {
        return id;
    }

    public void enterTime() {
        startTime = System.currentTimeMillis();
    }

    public void leaveTime() {
        endTime = System.currentTimeMillis();
    }
    //returns the time spent in the system
    public int timeElapsed() {
        return (int)(endTime-startTime)/1000;
    }

    public static void main(String[] args) {
        Customer c = new Customer();
        Customer c2 = new Customer(); // tähän pitäisi saada asiakasnumero generointi
        System.out.println("Customer " + c.getId() + " arrived");
        c.enterTime();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println("kfkfkfk");
        }
        c.leaveTime();

        System.out.println("Time customer spent in the system: " + c.timeElapsed() + " seconds");

    }
}
