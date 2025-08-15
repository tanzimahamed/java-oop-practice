public class WordFrequency {
    public static void main(String[] args) {
        String str = "Java is easy and Java is powerful";
        String word = "Java";
        String[] words = str.split(" ");
        int count = 0;
        for (String w : words) {
            if (w.equals(word)) count++;
        }
        System.out.println("Word '" + word + "' appears " + count + " times.");
    }
}

