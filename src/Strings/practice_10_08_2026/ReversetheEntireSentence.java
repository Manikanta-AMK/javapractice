package Strings.practice_10_08_2026;

public class ReversetheEntireSentence {

	public static void main(String[] args) {
		
		String name = "manikanta arige";
		String[] words = name.split(" ");
		String reverse = " ";
		for(String  word: words)
		{
			if(word.equals("arige"))
			{
				for(int i=word.length()-1;i>=0;i--)
				{
					reverse+=word.charAt(i);
				}
			}
		}
		System.out.println("reverse word is "+reverse);
	}
}
