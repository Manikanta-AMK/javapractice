package Strings.practice_10_08_2026;

public class LongestWordinSentence {

	public static void main(String[] args) {
		
		String name = "manikanta arige";
		String[] words = name.split(" ");
		String longest = " ";
		
		for(String word: words)
		{
			if(word.length()>longest.length())
			{
				longest =word;
			}
		}
		System.out.println("longest word is: "+longest);
		System.out.println("length of longest word is: "+longest.length());
	}

}
