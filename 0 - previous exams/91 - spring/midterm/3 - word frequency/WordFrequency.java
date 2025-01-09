import java.util.HashMap;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        scanner.close();
        sentence = sentence.toLowerCase();
        
        String[] words = sentence.split(" ");
        
        HashMap<String, Integer> wordFrequency = new HashMap<String, Integer>();
        
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }
        
        for (String string : wordFrequency.keySet()) {
            System.out.println(string + ":" + wordFrequency.get(string));
        }
    }
}