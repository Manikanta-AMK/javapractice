package Strings.practice_10_08_2026;

import java.util.Arrays;

public class CompareTwoStringswithoutusingequalsmethod {

	public static void main(String[] args) {
		
		String name = "madam";
		String name1 = "madam";
		
		char[] ch1 = name.toCharArray();
		char[] ch2 = name1.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(ch1==ch2)
		{
			System.out.println("both strings are anagram");
		}else {
			System.out.println("both strings are not anagram");
		}
	}
}
