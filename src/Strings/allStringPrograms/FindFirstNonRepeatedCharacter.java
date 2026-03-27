package Strings.allStringPrograms;

public class FindFirstNonRepeatedCharacter {

	public static void main(String[] args) {
		
		String name = "manikanta arige";
		
		for(int i=0;i<name.length();i++)
		{
			char ch = name.charAt(i);
			if(name.indexOf(ch)==name.lastIndexOf(ch))
			{
				System.out.println("first non repeated character is: "+ch);
				break;
			}
		}
	}
}
