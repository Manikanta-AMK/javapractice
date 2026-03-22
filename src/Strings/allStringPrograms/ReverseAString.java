package Strings.allStringPrograms;

public class ReverseAString {

	public static void main(String[] args) {
		
		String name = "Manikanta Arige";
		String reverse = "";

		for(int i=name.length()-1;i>=0;i--)
		{
			reverse = reverse+name.charAt(i);
		}
		System.out.println("reverse name is: "+reverse);
		
	}
}
