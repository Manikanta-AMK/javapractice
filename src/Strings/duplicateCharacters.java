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
	
	
	char[] newch = {'c','d','g','h','e','s','d','d','g','h'};
	
	HashSet<Character> uniqChar1 = new HashSet<Character>();
	HashSet<Character> duplicateChar1 = new HashSet<Character>();
	 
	for(char newcharacter: newch)
	{
		if(!uniqChar1.add(newcharacter))
		{
			duplicateChar1.add(newcharacter);
		}
	}
	System.out.println("uniq characters are: "+ uniqChar1);
	System.out.println("duplicat Characters are: "+duplicateChar1);
	
	
	}
}
