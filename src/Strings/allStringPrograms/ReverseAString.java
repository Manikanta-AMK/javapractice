package Strings.allStringPrograms;

public class ReverseAString {

	public static void main(String[] args) {
		
		String name = "Manikanta Arige";
		String reverse = "";

		for(int i=name.length()-1;i>=0;i--)
		{
			reverse = reverse+name.charAt(i);
		}
		System.out.println("reverse name is: "+reverse);
		
		StringBuilder sb = new StringBuilder(name);
		StringBuilder s1 = sb.reverse();
		System.out.println(s1);
		
		String[] words = name.split("");
		for(String word:words)
		{
			if(int j=word.length()-1;j>=0;j--)
			{
				
			}
		}
		
		
		
	}
}
