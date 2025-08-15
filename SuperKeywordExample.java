class Bird {
    void sound() {
        System.out.println("Bird chirps");
    }
}

class Sparrow extends Bird {
    @Override
    void sound() {
        super.sound(); // Call parent method
        System.out.println("Sparrow tweets");
    }
}

public class SuperKeywordExample {
    public static void main(String[] args) {
        Sparrow s = new Sparrow();
        s.sound();
    }
}

