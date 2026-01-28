package practice;

public class palindrome {

	public static void main(String [] args)
	{
		String s1 = "madam";
		StringBuilder sb =new StringBuilder(s1);
		StringBuilder temp = sb.reverse();
		String s2 = temp.toString();
		System.out.println("String reverse is "+s2);
		
		if(s1.equals(s2))
		{
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
		
		StringBuilder sb3 = new StringBuilder(s1);
		StringBuilder sb4 = sb3.reverse();
		String s5 = sb4.toString();
		System.out.println(s5);
		
		if(s5.equals(s1))
		{
			System.out.println("the string is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
		
	}
}
