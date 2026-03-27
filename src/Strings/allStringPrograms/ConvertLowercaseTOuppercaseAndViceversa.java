package Strings.allStringPrograms;

public class ConvertLowercaseTOuppercaseAndViceversa {

	public static void main(String[] args) {
		
		String name = "Manikanta Arige";
		String result = " ";		
			
		for(int i=0;i<name.length();i++)
		{
			char ch = name.charAt(i);
			if(Character.isUpperCase(ch))
			{
				result = result+Character.toLowerCase(ch);
			}else {
				result = result+Character.toUpperCase(ch);
			}
		}
		System.out.println(result);
		
		//direct convertion to upper and lower
		
//		String lowercase = name.toLowerCase();
//		System.out.println(lowercase);
//		
//		String uppercase = lowercase.toUpperCase();
//		System.out.println(uppercase);
		
	}
}
