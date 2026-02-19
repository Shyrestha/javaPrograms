import java.util.Scanner;

public class positivenegative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to check positive or negative: ");
        int number = sc.nextInt();
if (number >= 0) {
            System.out.println("Positive");
        } 

        else {
            System.out.println("negative");
        }

        sc.close();
    }
}
