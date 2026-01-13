public class task_4 {
    private String name;

    public task_4(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        // Create an instance of the Cat class with a name
        task_4 cat = new task_4("Whiskers");
        task_4 cat2 = new task_4("Rex");

        // Call the meow method on the cat instance
        cat.meow();
        cat.meow();
        cat2.meow();
        cat.meow();
    }
}