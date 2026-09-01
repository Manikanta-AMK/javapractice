package Strings.allStringPrograms;

public class viseversaString {

	public static void main(String[] args)
	{
		String name = "Manikanta";
		String viseversa = "";
//		for(int i=0;i<name.length();i++)
//		{
//			char ch = name.charAt(i);
//			if(Character.isLetter(ch)) 
//			{
//				if(Character.isUpperCase(ch))
//				{
//					viseversa+=Character.toLowerCase(ch);
//				}else {
//					viseversa+=Character.toUpperCase(ch);
//				}
//			}
//		}
		
		
		//other way
		
		for(char ch: name.toCharArray())
		{
			viseversa += Character.isUpperCase(ch) ? Character.toLowerCase(ch): Character.toUpperCase(ch);
		}
		
		System.out.println(viseversa);
	}
}
