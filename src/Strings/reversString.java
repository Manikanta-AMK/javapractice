package Strings;

public class reversString {

	public static void main(String[] args) {
		
		String name = "Manikanta Arige";
		int len = name.length();
		String reverse = " ";
		String name2 = name.replace(" ", "");
		
		for(int i=len-1;i>=0;i--)
		{
			reverse = reverse+name.charAt(i);
		}
		System.out.println("the reverse String is: "+reverse);
		System.out.println("name withoutspace: "+name2);

		String stringname = "automation";
		String reversename = "";
		for(int i=stringname.length()-1;i>=0;i--)
		{
			reversename = reversename+stringname.charAt(i);
		}
		System.out.println("reversename is : "+ reversename);
		
		String string = "newstring";
		String string2 = " ";
		for(int i=string.length()-1;i>=0;i--)
		{
			string2 = string2+string.charAt(i);
		}
		System.out.println(string2);
		
		System.out.println(string.substring(0,4));
	
	}
}
