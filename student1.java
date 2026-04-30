class Student1 {
    String name;
    int age;

    // Default constructor
    Student1() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    Student1(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student1("Riya", 20);

        s1.display();
        s2.display();
    }
}