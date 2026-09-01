package Strings.practice_10_08_2026;

public class Convert_Uppercase_to_Lowercase_ViceVersa {

	public static void main(String[] args) {
		
		String name = "ManiKanta";
		String viseversa = "";
		
		for(char ch: name.toCharArray())
		{
			if(Character.isLetter(ch) && Character.isUpperCase(ch))
			{
				viseversa+=Character.toLowerCase(ch);
			}else {
				viseversa+=Character.toUpperCase(ch);
			}
		}
		System.out.println(viseversa);
		
		
	}
}
