package Strings.practice_10_08_2026;

import java.util.HashMap;
import java.util.Map;

public class MinimumOccurringCharacter {

	public static void main(String[] args) {
		
		String name = "manikanta";
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(char ch: name.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		
		int mincount = Integer.MAX_VALUE; 
		char minchar = ' ';
		
		for(Map.Entry<Character, Integer> entry: map.entrySet())
		{
			if(entry.getValue()<mincount)
			{
				minchar = entry.getKey();
				mincount = entry.getValue();
			}
		}
		System.out.println(minchar+": "+mincount);
	}
}
