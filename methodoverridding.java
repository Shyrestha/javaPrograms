class methodoverridding {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends methodoverridding {
    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String args[]) {
        Dog d = new Dog();
        d.sound();
    }
}