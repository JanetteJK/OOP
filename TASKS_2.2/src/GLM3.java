import java.awt .*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GLM3 {
    public class Item {
        private double cost;
        private String category;
        private int amount;

        public Item(double cost, String category, int amount){
            this.cost = cost;
            this.category = category;
            this.amount = amount;
        }
        public double getCost(){
            return cost;
        }
        public String getCategory(){
            return category;
        }
        public int getAmount(){
            return amount;
        }
        public void setAmount(int amount){
            this.amount = amount;
        }
    }

    private HashMap<String, Item> groceryList = new HashMap<>();


    public void addItem(String item, double cost, String category, int amount) {
        if (groceryList.containsKey(item)) {
            System.out.println(item + " is already on the list.\n");
        } else {
            System.out.println("Adding " + item + " to the list.\n");
            groceryList.put(item, new Item(cost, category, amount));
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
        for (Map.Entry<String, Item> entry : groceryList.entrySet()) {
            String item = entry.getKey();
            System.out.println(item);
        }
    }

    public void checkItem(String item) {
        System.out.println("List contains " + item + "? - " + groceryList.containsKey(item));

    }

    public void calculateTotalCost() {
        double total = 0;
        for (Map.Entry<String, Item> entry : groceryList.entrySet()) {
            int times = entry.getValue().getAmount();
            double price = entry.getValue().getCost();
            double value = times * price;
            total = total + value;
        }
        System.out.println("The total value of the groceries is: " + total + "€");
    }

    public void displayByCategory(String category) {
        System.out.println(category + ": ");
        for (Map.Entry<String, Item> entry : groceryList.entrySet()){
            if (entry.getValue().getCategory().equals(category)) {
                String item = entry.getKey();
                System.out.println(item);
            }
        }

    }

    public void updateAmount(String item, int newAmount){
        if (groceryList.containsKey(item)){
            groceryList.get(item).setAmount(newAmount);
            System.out.println("There are now " + newAmount + " " + item + " on the list");
        } else {
            System.out.println("Item not on list.");
        }
    }

}





