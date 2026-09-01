package Strings.practice_10_08_2026;

public class Count_Uppercase_and_Lowercase {

	public static void main(String[] args) {
		
		String name = "manikanta";
		int uppercase =0;
		int lowercase = 0;
		
		for(char ch: name.toCharArray())
		{
			if(Character.isLetter(ch) && Character.isUpperCase(ch))
			{
				uppercase++;
			}
			else {
				lowercase++;
			}
		}
		System.out.println("uppercase count is: "+uppercase);
		System.out.println("lowercase count is: "+lowercase);
	}
}
