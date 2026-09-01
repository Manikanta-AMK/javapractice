package Strings.practice_10_08_2026;

import java.util.HashSet;

public class secondRepeatedCharacter {

	public static void main(String[] args) {
		
		String name = "manikanta arige";
		int count =0;
		HashSet<Character> set = new HashSet<>();
		
		for(char ch:name.toCharArray())
		{
			if(set.contains(ch))
			{
				count++;
				if(count==2) 
				{
					System.out.println("second repeated character is: "+ch);
				}
			}else {
				set.add(ch);
			}
			
			
		}
	}
}
