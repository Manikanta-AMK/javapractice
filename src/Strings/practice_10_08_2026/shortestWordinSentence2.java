package Strings.practice_10_08_2026;

public class shortestWordinSentence2 {

	public static void main(String[] args) {

		String name = "manikanta arige";
		String[] words = name.split(" ");
		String shortest = words[0];
				
		for(String word: words)
		{
			if(word.length()<shortest.length())
			{
				shortest = word;
			}
		}
		
		System.out.println("shortest length of the word is: "+shortest);
		System.out.println("length of the shortest word is: "+shortest.length());
	}

}
