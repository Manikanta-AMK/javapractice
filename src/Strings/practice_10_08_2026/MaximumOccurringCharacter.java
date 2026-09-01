package Strings.practice_10_08_2026;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MaximumOccurringCharacter {

	public static void main(String[] args) {
		
		String name = "manikanta";
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(char ch: name.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		
		int maxcount = 0;
		char maxchar = ' ';
		
		for(Map.Entry<Character, Integer> entry:map.entrySet())
		{
			if(entry.getValue() > maxcount)
			{
				maxchar = entry.getKey();
				maxcount = entry.getValue();
			}
		}
		System.out.println(maxchar+": "+maxcount);
		
	}
}
