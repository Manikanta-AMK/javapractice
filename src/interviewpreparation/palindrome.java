package interviewpreparation;

public class palindrome {

	public static void main(String[] args) {
		
		String name = "MadaM";
		String reverse =" ";
		for(int i=name.length()-1;i>=0;i--)
		{
			reverse = reverse+name.charAt(i);
		}
		String name2 = reverse.toString();
		System.out.println("reverse name is : "+reverse);
		
		if(name2.equalsIgnoreCase(name))
		{
			System.out.println("give String is palindrome");
		}else {
			System.out.println("given string is not palindrome");
		}
	}
}
