package interview;

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
	}
}
