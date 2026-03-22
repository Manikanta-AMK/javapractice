package Strings;

public class firstLetterCaps {

	public static void main(String[] args) {
		
		String name = "manikanta arige";
		String[] words = name.split(" ");
		for(String word: words)
		{
			String first = word.substring(0,1).toUpperCase();
			String rest = word.substring(1);
			System.out.print(first+rest+" ");
		}
		
		System.out.println(" ");
		//words are reversed as per the sequence
		
		StringBuilder reverse = new StringBuilder();
		for(int i=words.length-1;i>=0;i--)
		{
			reverse.append(words[i]);
			if(i!=0)
			{ 
				reverse.append(" ");
			}
		}
		System.out.println("words are reversed in sequence: "+reverse.toString());
		
	}
}
