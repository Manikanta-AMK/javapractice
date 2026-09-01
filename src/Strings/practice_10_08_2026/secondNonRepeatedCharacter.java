package Strings.practice_10_08_2026;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class secondNonRepeatedCharacter {

	public static void main(String[] args) {
		
		String name = "manikanta arige";
		int count =0;
		HashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for(char ch: name.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		
		for(char ch:name.toCharArray())
		{
			if(map.get(ch)==1)
			{
				count++;
				if(count==2)
				{
					System.out.println("second non repeated character is: "+ch);
				}
			}
		}
		
		
	}
}
