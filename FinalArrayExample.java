public class FinalArrayExample {
    public static void main(String[] args) {
        final int[] numbers = {10, 20, 30};

        // Changing elements is allowed
        numbers[0] = 100;
        numbers[1] = 200;

        // numbers = new int[]{1, 2, 3}; // ❌ Error: cannot assign a value to final variable

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

