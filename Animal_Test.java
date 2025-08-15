
public class Animal_Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();

        dog.eat();
        dog.makeSound();

        cat.eat();
        cat.makeSound();

        bird.eat();
        bird.makeSound();

    }
}
class Animal {
    String name;
    String sound;
    void eat() {
        System.out.println(name);

    }
    void makeSound() {
        System.out.println(name+ "Sound  "+sound);
    }

}
class Dog extends Animal {
    Dog() {
        name = "Dog";
        sound = "dog.wav";



    }

    @Override
    void makeSound() {
                super.makeSound();
    }
}



class Cat extends Animal {
    Cat() {
        name = "Cat";
        sound = "cat.wav";


    }
    @Override
    void makeSound() {
        super.makeSound();

    }



}
class Bird extends Animal {
    Bird() {


        name = "Bird";
        sound = "Woof ";
    }
    @Override
    void makeSound() {
        super.makeSound();

    }

}