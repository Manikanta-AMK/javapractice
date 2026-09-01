package Strings.practice_10_08_2026;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class countTheNumberOfChars {

	public static void main(String[] args) {
		
		String name = "manikanta";
		char target  = 'a';
		int count=0;
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(char ch: name.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
			if(ch==target)
			{ 
				count++;
			}
		}
		
		for(Map.Entry<Character, Integer>c: map.entrySet())
		{
			System.out.println(c.getKey()+": "+c.getValue());
		}
		
		System.out.println("targetcount is "+ count);
		
	}
}
