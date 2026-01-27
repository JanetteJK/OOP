import java.awt.*;
import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item){
        if (groceryList.contains(item)){
            System.out.println(item + " is already on the list.\n");
        } else {
            System.out.println("Adding " + item + " to the list.\n");
            groceryList.add(item);
        }
    }

    public void removeItem(String item) {
        System.out.println("Removing " + item + " from the list.\n");
        if (groceryList.contains(item)) {
            groceryList.remove(item);
        }else {
            System.out.println(item + " was not on the list.\n");
        }
    }

    public void displayList() {
        System.out.println("Grocery list:");
        for (String item : groceryList) {
            System.out.println(item);
        }
    }

    public void checkItem(String item) {
        System.out.println("List contains " + item + "? - " + groceryList.contains(item));


    }
}