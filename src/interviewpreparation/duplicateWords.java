package interviewpreparation;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class duplicateWords {

	public static void main(String[] args) {
		
		String name = "big black bug on big black nose";
		String[] words = name.split(" ");
		
		LinkedHashSet<String> uniq = new LinkedHashSet<>();
		LinkedHashSet<String> duplicate = new LinkedHashSet<>();
		
		for(String word: words)
		{
			if(!uniq.add(word))
			{
				duplicate.add(word);
			}
		}
		
		System.out.println("uniq words are: "+String.join(" ", uniq));
		System.out.println("duplicate words are: "+String.join(" ",duplicate));
	}
}
