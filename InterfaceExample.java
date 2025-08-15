interface AnimalInterface {
    void sound();
}

class Dog implements AnimalInterface {
    public void sound() {
        System.out.println("Woof");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        AnimalInterface a = new Dog();
        a.sound();
    }
}

