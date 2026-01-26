import java.util.List;
import java.util.Scanner;

public class GroceryListUser {
    public static void main(String[] args) {
        GroceryListManager list;
        list = new GroceryListManager();

        list.addItem("Apples");
        list.addItem("Milk");
        list.addItem("Bread");
        list.addItem("Apples");

        list.displayList();

        list.checkItem("Milk");

        list.removeItem("Milk");
        list.removeItem("Milk");

        list.displayList();



        }
    }

