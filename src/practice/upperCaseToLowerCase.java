package practice;

public class upperCaseToLowerCase {

	public static void main(String[] args) {
		
		String name = "ManiKanTa";
		String result ="" ;
		
		System.out.println("coverted to lower case: "+name.toLowerCase());
		
		for(int i=0;i<name.length();i++)
		{
			char characters = name.charAt(i);
			if(Character.isUpperCase(characters))
			{
				 result += Character.toLowerCase(characters);
			}else {
				result += characters;
		}}
		System.out.println("coverted to lower case: "+result);
		
	}
}
