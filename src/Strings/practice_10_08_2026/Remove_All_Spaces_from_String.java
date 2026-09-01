package Strings.practice_10_08_2026;

public class Remove_All_Spaces_from_String {

	public static void main(String[] args) {
		
		String name = "manikanta arige";
		
		// with inbuilt methods
		String renamed = name.replace(" ","");
		System.out.println(renamed);
		
		//without inbuilt methods
		for(char ch: name.toCharArray())
		{
			if(Character.isLetter(ch))
			{
				System.out.print(ch);
			}
		}
		
	}
}
