package Strings.practice_10_08_2026;

import java.util.HashSet;

public class DuplicateCharacters {

	public static void main(String[] args) {

		String name = "manikanta arige";

		HashSet<Character> unique = new HashSet<>();
		HashSet<Character> duplicate = new HashSet<>();

		for (char ch : name.toCharArray()) {
			if (Character.isLetter(ch)) {
				if (!unique.add(ch)) {
					duplicate.add(ch);
				}
			}
		}
		System.out.println("unique characters are " + unique);
		System.out.println("unique characters are " + duplicate);
	}
}
