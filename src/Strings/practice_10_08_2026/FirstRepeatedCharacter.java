package Strings.practice_10_08_2026;

import java.util.HashSet;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		
		String name = "manikanta arige";
		
		HashSet<Character> set = new HashSet<>();
		
		for(char ch: name.toCharArray())
		{
			if(set.contains(ch))
			{
				System.out.println("first repeated character is: "+ch);
				break;
			}
			else {
				set.add(ch);
			}
			
		}
	}
}
