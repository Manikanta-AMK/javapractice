package Strings;

public class checkDigits {
	
	public static void main(String[] args) {
		
		String name = "12345";
		
		if(digits(name))
		{
			System.out.println("String have the digits");
		}else {
			System.out.println("String does not have the digits");
		}
	
	}	
	
	public static boolean digits(String name)
	{
		for(char ch: name.toCharArray())
		{
			if(!Character.isDigit(ch))
			{
				return false;
			}
		}
		return true;
	}
}