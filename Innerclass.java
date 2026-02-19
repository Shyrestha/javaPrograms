import java.util.Scanner;

class Outer {
    Scanner sc = new Scanner(System.in);
    int outerdata;

    // Constructor
    Outer() {
        System.out.println("Enter a no: ");
        outerdata = sc.nextInt();
    }

    class Innerclass {
        void display() {
            System.out.println("Value of the outer data is: " + outerdata);
        }
    }

    public static void main(String[] args) {
        Outer outerobj = new Outer();
        Outer.Innerclass innerobj = outerobj.new Innerclass();
        innerobj.display();
    }
}
