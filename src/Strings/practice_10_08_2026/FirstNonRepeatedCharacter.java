package Strings.practice_10_08_2026;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		
		String name = "manikanta arige";
		
		for(char ch: name.toCharArray())
		{
			if(name.indexOf(ch)==name.lastIndexOf(ch))
			{
				System.out.println("first non repeated character is: "+ch);
				break;
			}
		}
	} 
}
