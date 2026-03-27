package practice2;

public class palindrome {

	public static void main(String[] args)
	{
		String name = "MadaM";
		String reverse="";
		for(int i=name.length()-1;i>=0;i--)
		{
			reverse = reverse+name.charAt(i);
		}
		if(reverse.equals(name))
		{
			System.out.println("Strig is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
	}
}
