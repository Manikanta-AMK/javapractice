package Strings.allStringPrograms;

public class ReverseEachWordInASentence {

	public static void main(String[] args) {
		
		String name = "Manikanta Arige";
		String[] words = name.split(" ");
		String reverse = "";
		
		for(String word: words)
		{
			for(int i=word.length()-1;i>=0;i--)
			{
				reverse = reverse+word.charAt(i);
			}
			reverse = reverse+ " ";
		}
		System.out.println("reversed name is: "+reverse);
	}
}
