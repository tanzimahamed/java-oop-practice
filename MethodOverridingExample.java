class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal a1 = new Animal(); // Parent reference + Parent object
        Animal a2 = new Dog();    // Parent reference + Child object (Upcasting)

        a1.sound(); // Calls Animal's method
        a2.sound(); // Calls Dog's overridden method (Runtime decision)
    }
}

