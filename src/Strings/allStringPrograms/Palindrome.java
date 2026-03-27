package Strings.allStringPrograms;

public class Palindrome {

	public static void main(String[] args) {
		
		String name = "madam";
		String reverse = "";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			reverse = reverse+name.charAt(i);
		}
		
		if(name.equals(reverse))
		{
			System.out.println("string is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
	}
}
