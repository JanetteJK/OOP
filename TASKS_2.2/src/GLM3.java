import java.awt .*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GLM3 {


    private HashMap<String, Groceries> groceryList = new HashMap<>();


    public void addItem(String item, Groceries) {
        if (groceryList.containsKey(item)) {
            System.out.println(item + " is already on the list.\n");
        } else {
            System.out.println("Adding " + item + " to the list.\n");
            groceryList.put(item, Groceries);
        }
    }

    public void removeItem(String item) {
        if (groceryList.containsKey(item)) {
            System.out.println("Removing " + item + " from the list.\n");
            groceryList.remove(item);
        } else {
            System.out.println(item + " was not on the list.\n");
        }
    }

    public void displayList() {
        System.out.println("Grocery list:");
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            String item = entry.getKey();
            System.out.println(item);
        }
    }

    public void checkItem(String item) {
        System.out.println("List contains " + item + "? - " + groceryList.containsKey(item));

    }

    public void calculateTotalCost() {
        double total = 0;
        for (Map.Entry<String, Double> entry : groceryList.entrySet()) {
            double value = entry.getValue();
            total = total + value;
        }
        System.out.println("The total value of the groceries is: " + total + "€");
    }

    public void displayByCategory(String category) {

    }

    public class Groceries {
        public Groceries(double cost, String category) {
        }
    }
}




