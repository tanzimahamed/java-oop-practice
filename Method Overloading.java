
class Calculator {

    // add(int, int)
    int add(int a, int b) {
        return a + b;
    }

    // add(double, double)
    double add(double a, double b) {
        return a + b;
    }

    // add(int, int, int)
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 3));         // int version
        System.out.println(calc.add(4.5, 3.2));     // double version
        System.out.println(calc.add(2, 3, 4));      // three int version
    }
}

