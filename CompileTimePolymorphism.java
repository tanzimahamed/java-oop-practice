public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print("Hello");             // String method
        p.print(10);                  // Integer method
        p.print("Count", 5);          // Mixed method

    }
}
class Printer {
    void print(String message) {
        System.out.println("String: " + message);
    }

    void print(int number) {
        System.out.println("Integer: " + number);
    }

    void print(String message, int number) {
        System.out.println("Message: " + message + ", Number: " + number);
    }
}