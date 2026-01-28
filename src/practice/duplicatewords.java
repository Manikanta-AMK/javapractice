package practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class duplicatewords {

	public static void main(String[] args) {
		
		  String sentence = "Big black bug bit a big black dog on his big black nose";
		  
		  String[] words = sentence.toLowerCase().split(" ");
		  
		  LinkedHashSet<String> uniquewords = new LinkedHashSet<>();
		  LinkedHashSet<String> duplicatewords = new LinkedHashSet<>();
		  
		  for(String word: words)
		  {
			  if(!uniquewords.add(word))
			  {
				  duplicatewords.add(word);
			  }
		  }
		  System.out.println("unique words: "+String.join(" ", uniquewords));
		  System.out.println("duplicate words: "+String.join(" ",duplicatewords));
	
		LinkedHashSet<String> uniq = new LinkedHashSet<String>();
		LinkedHashSet<String> dup = new LinkedHashSet<String>();
		
		for(String word1: words)
		{
			if(!uniq.add(word1))
			{
				dup.add(word1);
			}
		}
		
		System.out.println("uniqword: "+String.join(" ", uniq));
		System.out.println("dup: "+ String.join(" ", dup));
	
	}}

