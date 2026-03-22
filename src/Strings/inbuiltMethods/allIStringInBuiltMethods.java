package Strings.inbuiltMethods;

public class allIStringInBuiltMethods {

	public static void main(String[]args)
	{
		//length() 
		String name = "Manikanta";
		System.out.println("name length is "+name.length());
		//isEmpty()
		System.out.println("name variable is not storing the value: "+name.isEmpty());
		//isBlank()
		System.out.println("name variable is Blank: "+name.isBlank());
		
		//charAt(int index)
		for(int i=0;i<name.length();i++)
		{
			char ch = name.charAt(i);
			System.out.println(" position id of the "+ch+" is "+i);
		}
		
		String str = "A😊";
		System.out.println(str.codePointAt(1));
	}
}
