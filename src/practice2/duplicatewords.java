package practice2;

import java.util.LinkedHashSet;

public class duplicatewords {

	public static void main(String[] args) {
		
		String name  = "big black name is big black name";
		String[] words = name.split(" ");
		//if u add coma in between the words of the string then u should use  ",\\s*" in split method
		
		LinkedHashSet<String> uniqword = new LinkedHashSet<String>();
		LinkedHashSet<String> duplicateword = new LinkedHashSet<String>();
		
		for(String word: words)
		{
			if(!uniqword.add(word))
			{
				duplicateword.add(word);
			}
		}
		
		System.out.println("unique words are: "+ uniqword + "the count of the letters "+uniqword.size());
		System.out.println("duplicate words are: "+String.join(" ", duplicateword));
		
	
	
	}
}
