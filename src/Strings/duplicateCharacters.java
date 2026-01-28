package Strings;

import java.util.HashSet;

public class duplicateCharacters {

	public static void main(String[] args) {
		
		String name  = "ManikantaArige";
		
		char[] ch  = name.toCharArray();
		
		HashSet<Character> uniqChar = new HashSet<Character>();
		HashSet<Character> duplicateChar = new HashSet<Character>();
		 
		for(char characters: ch)
		{
			if(!uniqChar.add(characters))
			{
				duplicateChar.add(characters);
			}
		}
		System.out.println("uniq characters are: "+ uniqChar);
		System.out.println("duplicat Characters are: "+duplicateChar);
	}
}
