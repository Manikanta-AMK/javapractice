package StringProgramsPractice;

public class reverseString {

	public static void main(String[] args) {

		String name = "Manikanta";
		
		//reverse with inbuilt methods like--- StringBuilder() or StringBuffer() 
		StringBuilder sb = new StringBuilder(name);
		String name2 = sb.reverse().toString();
		System.out.println(name2);
		
		//reverse with for loop
		String reverse ="";
		for(int i=name.length()-1;i>=0;i--)
		{
			reverse = reverse+name.charAt(i);
		}
		System.out.println("String is reveresed: "+reverse);
	}
}
