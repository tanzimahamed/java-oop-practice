// Abstract class Animal11
abstract class Animal11 {
    // Abstract method (only declaration, no body)
    abstract void makeSound();
    // Normal method (fully implemented)
    void eat() {
        System.out.println("This animal is eating food.");
    }
}
// Dog class extends Animal and provides implementation for makeSound()
class Dog11 extends Animal11 {
    // Implementing the abstract method
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

// Cat class extends Animal and provides implementation for makeSound()
class Cat11 extends Animal11 {
    // Implementing the abstract method
    void makeSound() {
        System.out.println("Cat meows.");
    }
}


