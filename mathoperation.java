class MathOperation {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperation m = new MathOperation();

        System.out.println("Sum of 2 ints: " + m.add(2, 3));
        System.out.println("Sum of 2 doubles: " + m.add(2.5, 3.5));
        System.out.println("Sum of 3 ints: " + m.add(1, 2, 3));
    }
}