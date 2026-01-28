import java.util.List;
import java.util.Scanner;

public class GLU3 {
    public static void main(String[] args) {
        GLM2 list;
        list = new GLM2();

        list.displayList();

        list.addItem("Apples", 2, "fruits");
        list.addItem("Milk", 4.4, "dairy");
        list.addItem("Bread", 5.5,"bakery");
        list.addItem("Apples" ,2.0, "fruits");

        list.removeItem("Apples");

        list.displayList();

        list.calculateTotalCost();



    }
}


