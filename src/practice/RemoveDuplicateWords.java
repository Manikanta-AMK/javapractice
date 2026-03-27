package practice;

import java.util.LinkedHashSet;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        
        String sentence = "Big black bug bit a big black dog on his big black nose";
        
        // Convert to lowercase to handle case-insensitive duplicates
        String words[] = sentence.toLowerCase().split(" ");
        
        
        // LinkedHashSet removes duplicates and preserves order
        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>();
        
        for (String word : words) {
            uniqueWords.add(word);
        }
        
        // Rebuild sentence without duplicates
        StringBuilder result = new StringBuilder();
        for (String word : uniqueWords) {
            result.append(word).append(" ");
        }
        
        System.out.println("Original: " + sentence);
        System.out.println("Without Duplicates: " + result.toString().trim());
    }
}

