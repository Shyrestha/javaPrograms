public class fibonacci {

    // Recursive method
    static int fibonacci (int n) {
        if (n <= 1) {
            return n;   // Base case
        }
        return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive case
    }

    public static void main(String[] args) {

        int n = 7;  

        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

