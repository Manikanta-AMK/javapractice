package Strings.practice_10_08_2026;

public class ReverseEachWordinSentence {

	public static void main(String[] args) {
		
		String name = "manikanta arige";
		String reverse = " ";
		String[] words = name.split(" ");
		
		for(String word: words)
		{
			for(int i=word.length()-1;i>=0;i--)
			{
				reverse+=word.charAt(i);
			}
			reverse=reverse+" ";
		}
		System.out.println("reverse String is: "+reverse);
	}
}
