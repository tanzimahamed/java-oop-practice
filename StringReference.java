public class StringReference {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        boolean result = (a == b);
        System.out.println("Do they refer to same object? " + result);
    }
}
