import java.util.Scanner;

public class marks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int number = sc.nextInt();

        if (number >= 90) {
            System.out.println("Grade A");
        } else if (number >= 80) {
            System.out.println("Grade B");
        } else if (number >= 70) {
            System.out.println("Grade C");
        } else if (number >= 60) {
            System.out.println("Grade D");
        } else if (number >= 40) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade F");
        }

        sc.close();
    }
}
