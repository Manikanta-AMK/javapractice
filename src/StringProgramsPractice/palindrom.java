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
		
		String name2 = "abcba";
		StringBuilder sb1 = new StringBuilder(name2);
		String reverse = sb1.reverse().toString();
		System.out.println(reverse);
		if(reverse.equals(name2))
		{
			System.out.println("name2 is palindrome "+reverse);
		}else {
			System.out.println("name2 is not palindrome "+reverse);
		}
	}
}
