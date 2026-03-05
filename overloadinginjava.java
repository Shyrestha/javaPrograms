class overloadinginjava{
    String name;
    int age;

    
    overloadinginjava() {
        name = "Unknown";
        age = 0;
    }

    
    overloadinginjava(String n) {
        name = n;
        age = 0;
    }

    
    overloadinginjava(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + " Age: " + age);
    }

    public static void main(String args[]) {
        overloadinginjava s1 = new overloadinginjava();
        overloadinginjava s2 = new overloadinginjava("Rahul");
        overloadinginjava s3 = new overloadinginjava("Aman", 20);

        s1.display();
        s2.display();
        s3.display();
    }
}