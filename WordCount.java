
public class WordCount {
    public static void main(String[] args) {
        String str = "Java is simple";
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') count++;
        }
        System.out.println("Word count: " + count);
    }
}
