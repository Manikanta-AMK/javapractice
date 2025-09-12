package practice;

import java.util.LinkedHashSet;

public class removeDuplicateLetters {

	public static void main(String[] args) {
		  String sentence = "Big black bug bit a big black dog on his big black nose";
	        
	        // Convert to lowercase to handle case-insensitive duplicates
	        sentence = sentence.toLowerCase();
	        
	        char target = 'b';

	        LinkedHashSet<Character> uniqueLetters = new LinkedHashSet<>();
	        
	        for (char letters : sentence.toCharArray()) {
	        	if(Character.isLetter(target)) {
	        	uniqueLetters.add(letters);}
	        }
	        
	        // Rebuild sentence without duplicates
	        StringBuilder result = new StringBuilder();
	        for (Character word : uniqueLetters) {
	            result.append(word).append("");
	        }
	        
	        System.out.println("Original: " + sentence);
	        System.out.println("Without Duplicates: " + result.toString().trim());
	    }
}
