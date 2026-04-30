

// SalesDepartment interface
interface SalesDepartment {
    void processSale(double amount);
}

// FinanceDepartment interface
interface FinanceDepartment {
    void generateInvoice(String clientName, double amount);
}

// CommercialExecutive class implementing both interfaces
class CommercialExecutive implements SalesDepartment, FinanceDepartment {

    double lastSaleAmount;
    String lastClient;

    // Implementing SalesDepartment method
    public void processSale(double amount) {
        lastSaleAmount = amount;
        System.out.println("Processing sale of amount: Rs. " + amount);
        System.out.println("Sale completed successfully!");
    }

    // Implementing FinanceDepartment method
    public void generateInvoice(String clientName, double amount) {
        lastClient = clientName;
        System.out.println("\nGenerating Invoice...");
        System.out.println("Client Name: " + clientName);
        System.out.println("Invoice Amount: Rs. " + amount);
        System.out.println("Invoice generated successfully!");
    }

    // Additional method
    void showSummary() {
        System.out.println("\n--- Commercial Summary ---");
        System.out.println("Last Client: " + lastClient);
        System.out.println("Last Sale Amount: Rs. " + lastSaleAmount);
        System.out.println("Operations handled efficiently across Sales and Finance departments.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        CommercialExecutive exec = new CommercialExecutive();

        exec.processSale(5000.0);
        exec.generateInvoice("ABC Pvt Ltd", 5000.0);
        exec.showSummary();
    }
}