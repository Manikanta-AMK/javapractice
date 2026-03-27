package Strings;

import java.util.HashMap;

public class frequencyOfLetters {

	public static void main(String[] args) {
		String name = "manikanta";
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char ch: name.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		System.out.println("frequencey of the letters: "+map);
	}
}
