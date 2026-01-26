import java.util.List;
import java.util.Scanner;

public class GLU2 {
    public static void main(String[] args) {
        GLM2 list;
        list = new GLM2();

        list.displayList();

        list.addItem("Apples", 2);
        list.addItem("Milk", 4.4);
        list.addItem("Bread", 5.5);
        list.addItem("Apples" ,2.0);

        list.removeItem("Apples");

        list.displayList();

        list.calculateTotalCost();



    }
}

