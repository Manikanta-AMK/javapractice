 package Strings;

import java.util.LinkedHashSet;

public class removeDuplicateWords {

	public static void main(String[] args) {
		
		String name = "Big black bug bit a big black dog on his big black nose";
		String [] words = name.split(" ");
		
		LinkedHashSet<String> uniq = new LinkedHashSet<String>();
		LinkedHashSet<String> duplicate = new LinkedHashSet<String>();
		
		for(String word: words)
		{
			if(!uniq.add(word))
			{
				duplicate.add(word);
			}
		}
		System.out.println("uniq words are: "+String.join(" ", uniq));
		System.out.println("duplicate words are: "+String.join(" ", duplicate));
		
//		String   target = "balck";
		String [] words2 = name.split(" ");
		int count=0;
		for(String wordcount: words2)
		{
			if(wordcount.equals("black"))
			{
				count  =  count++;
			}
		}System.out.println("the count of the word is: "+count);
	}
}
