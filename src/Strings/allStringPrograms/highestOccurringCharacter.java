package Strings.allStringPrograms;

import java.util.HashMap;

public class highestOccurringCharacter {

	public static void main(String[] args) {
		
		String name  = "Manikanta arige";
		char[] ch = name.toCharArray();

		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char c: ch)
		{
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println("the count of the all letters"+ map);
		
		char maxchar = ' ';
		int maxcount = 0;
		
		for(char c : map.keySet())
		{
			if(map.get(c)>maxcount)
			{
				maxcount = map.get(c);
				maxchar = c;
			}
		}
		System.out.println("the max char is: "+maxchar+" and max count is: "+maxcount);
		
	}
}
