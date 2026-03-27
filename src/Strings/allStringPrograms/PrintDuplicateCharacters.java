package Strings.allStringPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrintDuplicateCharacters {

	public static void main(String[] args) {
		
		String name = "Manikanta";
		char[] ch = name.toCharArray();
		
		LinkedHashSet<Character> unique = new LinkedHashSet<>();
		LinkedHashSet<Character> duplicate  = new LinkedHashSet<>();

		for(char c: ch)
		{
			if(!unique.add(c))
			{
				duplicate.add(c);
			}
		}
		System.out.println("unique letters are: "+unique);
		System.out.println("unique letters are: "+duplicate);
	}
}
