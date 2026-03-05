class calculatearea {

    // Area of square
    void area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }

    // Area of rectangle
    void area(int length, int breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    // Area of circle
    void area(double radius) {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }

    public static void main(String args[]) {
        calculatearea a = new calculatearea();

        a.area(2);
        a.area(4, 6);
        a.area(3.5);
    }
}