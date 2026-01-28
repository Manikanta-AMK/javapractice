package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class characterOccurance {

	public static void main(String[] args) {
		
		String name = "ManikantaArige";
		occurance(name);
		
		
	}
	
	public static void occurance(String name)
	{
		Map<Character, Integer> characters = new LinkedHashMap<>();
		
		for(char ch: name.toCharArray())
		{
			characters.put(ch, characters.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry: characters.entrySet())
		{
			System.out.println(entry.getKey()+" : "+ entry.getValue()); 
		}
		
	}
}
