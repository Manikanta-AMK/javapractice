package Strings.allStringPrograms;

import java.util.Arrays;

public class sortCharacters {

	public static void main(String[] args) {
		
		String name = "manikanta";
		
		char[] ch = name.toCharArray();
		Arrays.sort(ch);
		
		System.out.println(ch);		
	}
}
