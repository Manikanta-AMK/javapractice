package Strings.allStringPrograms;

public class oneCapsOneSmall {
	
	public static void main(String[] args) {
		
		String name = "manikanta arige";
		String result = " ";
		Boolean isupper = true;
		
		for(int i=0;i<name.length();i++)
		{
			char c = name.charAt(i);
			if(Character.isLetter(c))
			{
				if(isupper)
				{
					result += Character.toUpperCase(c);
				}else {
					result += Character.toLowerCase(c);
				}
				isupper = !isupper;
			}else {
				result = result + " ";
			}
		}System.out.println(result);
		
	}
	
}
