package Strings.allStringPrograms;

import java.util.HashSet;

public class FindFirstRepeatedCharacter {

	public static void main(String[] args) {
		
		String name = "manikanta";
		
		HashSet<Character> set = new HashSet<>();
		
		for(char ch: name.toCharArray())
		{
			if(set.contains(ch))
			{
				System.out.println("first repeated character is: "+ch);
				break;
			}
			set.add(ch);
		}		
	}
}
