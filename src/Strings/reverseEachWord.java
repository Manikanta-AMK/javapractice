package Strings;

public class reverseEachWord {
	
	public static void main(String[] args) {
		
		String string = "madam";
		String[] words = string.split(" ");
		StringBuilder sb = new StringBuilder();
		String reverse = " ";
		String sb1 = " ";
		// normal reverse a string 
		
		for(int i=string.length()-1;i>=0;i--)
		{
			reverse = reverse+string.charAt(i);
		}
		System.out.println("normal reverse string is: "+reverse);
		
		// reverse sequence by words
		
		for(String word: words)
		{
			sb1 = new StringBuilder(word).reverse().toString(); 
			System.out.print(sb1+" ");
		}
	
		
		System.out.println(" ");
		//reverse the place of the words
		
		for(int i = words.length-1;i>=0;i--)
		{
			sb = sb.append(words[i]);
			if(i!=0)
			{
				sb.append(" ");
			}
		}
		System.out.println("reverse the place of the words: "+sb);
		
		if(string.equals(sb1))
		{
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
		
		
	}
}
