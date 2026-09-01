package Strings.practice_10_08_2026;

import java.util.HashSet;

public class DuplicateWordsinSentence {

	public static void main(String[] args) {
		
		String name = "manikanta arige manikanta arige chanti";
		String[] words = name.split(" ");
		
		HashSet<String> unique =new HashSet<>();
		HashSet<String> duplicate = new HashSet<>();
		
		for(String word: words)
		{
			if(!unique.add(word))
			{
				duplicate.add(word);
			}
		}
	
		System.out.println("duplicate words are: "+duplicate);
	}
}
