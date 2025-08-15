public class NestedLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {       // Outer loop
            for (int j = 1; j <= 3; j++) {   // Inner loop
                System.out.print(i + " x " + j + " = " + (i * j) + "\t");
            }
            System.out.println(); // new line after each row
        }
    }
}

