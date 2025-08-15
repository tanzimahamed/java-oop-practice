public class LoopControlExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue; // skip 3
            if (i == 5) break;    // stop loop
            System.out.println(i);
        }
    }
}

