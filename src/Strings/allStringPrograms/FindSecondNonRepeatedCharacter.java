package Strings.allStringPrograms;

import java.util.HashMap;

public class FindSecondNonRepeatedCharacter {
	
	public static void main(String[] args) {
		
		String name = "manikanta";
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(char ch:name.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		System.out.println("count of the characters: "+map);
		
		int count=0;
		
		for(char ch: name.toCharArray())
		{
			if(map.get(ch)==1)
			{
				count++;
				if(count==2)
				{
					System.out.println("second non repeated charater is: "+ch);
					break;
				}
			}
		}
		
	}

}
