package Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class nonRepeatingChar {

	public static void main(String[] args) {
		
		String name = "Automation";
		
		Map<Character, Integer> chCount = new LinkedHashMap<>();
		
		for(char ch : name.toCharArray())
		{
			chCount.put(ch, chCount.getOrDefault(ch, 0) +1);
		}
		System.out.println(chCount);
		
		if(Map.Entry<Character, Integer> entry : chCount.entrySet()) 
		{
			
		}
	}
}
