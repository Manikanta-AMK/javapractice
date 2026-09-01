package Strings.practice_10_08_2026;

public class palindrome {

	public static void main(String[] args) {
		
		String name = "madam";
		String reverse="";
		for(int i=name.length()-1;i>=0;i--)
		{
			reverse=reverse+name.charAt(i);
		}
		System.out.println("reversed strign is: "+reverse);
		if(name.equals(reverse))
		{
			System.out.println("string is palindrome");
		}else {
			System.out.println("string is not palindrome");
		}
	}
}
