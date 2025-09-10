package StringProgramsPractice;

public class palindrom {

	public static void main(String[] args) {
		
		String name = "madam";
		StringBuilder sb = new StringBuilder(name);
		String reversedname = sb.reverse().toString();
		System.out.println(reversedname);
		if(name.equals(reversedname))
		{
			System.out.println("name is Palindrome");
		}else {
			System.out.println("name is not palindrome");
		}
		
	}
}
