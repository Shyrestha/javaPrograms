import java.util.*;

class Item {
    int code;
    double price;

    // Method to input data
    void getData(Scanner sc) {
        System.out.print("Enter Item Code: ");
        code = sc.nextInt();
        System.out.print("Enter Item Price: ");
        price = sc.nextDouble();
    }

    // Method to display data
    void display() {
        System.out.println(code + "\t\t" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item[] items = new Item[5];
        double total = 0;

        // Creating objects and taking input
        for (int i = 0; i < 5; i++) {
            items[i] = new Item();
            System.out.println("\nEnter details for Item " + (i + 1));
            items[i].getData(sc);
        }

        // Displaying data
        System.out.println("\nCode\t\tPrice");
        System.out.println("----------------------");

        for (int i = 0; i < 5; i++) {
            items[i].display();
            total += items[i].price;
        }

        // Total price
        System.out.println("----------------------");
        System.out.println("Total Price = " + total);

        sc.close();
    }
}