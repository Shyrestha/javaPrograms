import java.util.*;

class Tender {
    double cost;
    String companyName;

    // Method to input data
    void getData(Scanner sc) {
        System.out.print("Enter Company Name: ");
        companyName = sc.nextLine();
        System.out.print("Enter Cost: ");
        cost = sc.nextDouble();
        sc.nextLine(); // consume newline
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tender[] t = new Tender[5];

        // Input for 5 objects
        for (int i = 0; i < 5; i++) {
            t[i] = new Tender();
            System.out.println("\nEnter details for Tender " + (i + 1));
            t[i].getData(sc);
        }

        // Assume first is minimum
        double minCost = t[0].cost;
        String minCompany = t[0].companyName;

        // Find minimum cost
        for (int i = 1; i < 5; i++) {
            if (t[i].cost < minCost) {
                minCost = t[i].cost;
                minCompany = t[i].companyName;
            }
        }

        // Output result
        System.out.println("\nCompany with Minimum Cost: " + minCompany);
        System.out.println("Minimum Cost: " + minCost);

        sc.close();
    }
}