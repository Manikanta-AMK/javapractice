package Strings.practice_10_08_2026;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SortCharactersAlphabetically {

	public static void main(String[] args) {
	
		String name = "manikanta";
		
		char[] ch = name.toCharArray();		
		  Arrays.sort(ch);
		System.out.println("sorted array: "+new String(ch));
	}

}
