package Strings.allStringPrograms;

import java.util.HashMap;

public class CountNumberOfCharactersWordsSpaces {

	public static void main(String[] args) {
		
		String name = "Manikanta Arige";
		
		//count of the characters
		char[] ch = name.toCharArray(); 
		HashMap<Character, Integer> map = new HashMap<>(); 
		
		for(char c: ch)
		{
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println("count of the characters is: "+map);
		
		// count of the words
		String[] words = name.split(" ");
		int count = words.length;
		System.out.println("count of the words are: "+count);
		
		
	}
}
