package Strings;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class countOvels {
	
	public static void main(String[] args) {
		
		String name = "manikanta arige";
		char[] ch = name.toCharArray();
		int count = 0;
		for(Character c: ch)
		{
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				count++;
				
			}
		}
		System.out.println(count);
		
		//character occurrence
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(Character c: ch)
		{
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println("occurrence of characters are: "+map);
		
		// removing duplicate characters
		LinkedHashSet<Character> unique = new LinkedHashSet<>();
		LinkedHashSet<Character> duplicate = new LinkedHashSet<>();
		for(char c: ch)
		{
			if(!unique.add(c))
			{
				duplicate.add(c);
			}
		}
		
		System.out.println("unique letters are: "+unique);
		System.out.println("duplicate letters are: "+duplicate);
		
	}

}
