package practice2;

import java.util.Arrays;

public class anagaram3 {

	public static void main(String[] args) {		
		
		String anagram1 = "listen";
		String anagram2 = "silent";
		
		char[] ch3 = anagram1.toCharArray();
		char[] ch4 = anagram2.toCharArray();
		
		Arrays.sort(ch3);
		Arrays.sort(ch4);
		
		System.out.println("Strings are anagram: "+Arrays.equals(ch3,  ch4));
		
		
	}
}
