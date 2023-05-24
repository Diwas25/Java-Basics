package CommonPractices.CappsuleTest;

import java.util.ArrayList;
import java.util.List;

public class WordMatcher {
    // Function to get list of matching words
    public static List<String> getMatchingWords(List<String> words, String targetWord) {
        List<String> matchingWords = new ArrayList<String>();
        for (String word : words) {
            if (isSimilar(word, targetWord)) {
                matchingWords.add(word);
            }
        }
        return matchingWords;
    }

    // Function to check if two words are similar
    private static boolean isSimilar(String word1, String word2) {
        // Define your similarity criteria here
        return word1.length() == word2.length() && word1.charAt(0) == word2.charAt(0);
    }

    // Example usage
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();
        words.add("apple");
        words.add("banana");
        words.add("avocado");
        words.add("orange");
        words.add("blueberry");
        String targetWord = "apple";
        List<String> matchingWords = getMatchingWords(words, targetWord);
        System.out.println("Matching words for " + targetWord + ": " + matchingWords);
    }
}

