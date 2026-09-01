package Strings.allStringPrograms;

import java.util.Arrays;

public class CheckIfTwoStringsAreAnagrams {

	public static void main(String[] args) {
		
		String name = "Manikanta";
		String name1 = "Manikanta";
		 
		char[] ch1 = name.toCharArray();
		char[] ch2 = name1.toCharArray();
		
//		Arrays.sort(ch1);
//		Arrays.sort(ch2);
		
		System.out.println("two strings are anagram: "+Arrays.equals(ch1,ch2));
	}
}
