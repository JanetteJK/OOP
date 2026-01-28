import java.util.List;
import java.util.Scanner;

public class GLU3 {
    public static void main(String[] args) {
        GLM3 list;
        list = new GLM3();

        list.displayList();
        //add items to list
        list.addItem("Apples", 2, "fruits", 2);
        list.addItem("Milk", 4.4, "dairy", 1);
        list.addItem("Bread", 5.5,"bakery", 1);
        list.addItem("Oranges" ,2.0, "fruits", 6);
        list.addItem("Bananas", 0.9, "fruits", 3);
        // show list
        list.displayList();

        // remove items and show list again
        list.removeItem("Oranges");
        list.removeItem("Bread");
        list.displayList();
        // show categories
        list.displayByCategory("fruits");
        list.displayByCategory("dairy");
        // calculate cost of all items on list
        list.calculateTotalCost();
        //
        list.updateAmount("Oranges", 3);
        list.updateAmount("Milk", 3);



    }
}


