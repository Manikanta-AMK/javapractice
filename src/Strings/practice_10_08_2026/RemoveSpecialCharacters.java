package Strings.practice_10_08_2026;

import java.util.LinkedHashSet;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {

		String name = "Manikanta12343@#$%^&**";
		String result = " ";

		for (char ch : name.toCharArray()) {
			if (Character.isLetterOrDigit(ch)) {
				result += ch;
			}
		}
		System.out.println(result);

		// with replaceall method for removing the special characters

		result = name.replaceAll("[^A-Z,a-z,0-9]", "");
		System.out.println("String without special characters: " + result);

		// removing all except special characters

		result = name.replaceAll("[A-Z,a-z,0-9]", "");
		System.out.println("String with special characters: " + result);

		// removing numbers

		result = name.replaceAll("[0-9]", "");
		System.out.println("String without numbers: " + result);
		
		// keeping only  numbers

		result = name.replaceAll("[^0-9]", "");
		System.out.println("String with only numbers: " + result);
	}
}
