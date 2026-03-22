package practice2;

import java.util.HashMap;

public class characterOccurance {

	public static void main(String[] args) {
		
		String name = "Automation";
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(char ch: name.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		System.out.println(map);
		
		
		char[] characters = name.toCharArray();
		HashMap<Character, Integer> map1 = new HashMap<Character,Integer>();
		char target = 'a';
		for(char character: characters)
		{
			if(target==character)
			{
				map1.put(character,map1.getOrDefault(character,0)+1);
			}
			
			
		}
		System.out.println(map1);
		
		
		
	}
}
