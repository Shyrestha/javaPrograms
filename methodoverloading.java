class methodoverloading {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String args[]) {
        methodoverloading m = new methodoverloading();

        System.out.println("Sum: " + m.add(5, 10));
        System.out.println("Sum: " + m.add(5, 10, 15));
        System.out.println("Sum: " + m.add(5.5, 2.5));
        System.out.println("sum:" +  m.add(12.65,34.65));
    }
}