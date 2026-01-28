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
	}
}
