package practice2;

public class reverseString2 {
	
	public static void main(String[] args) {
		
		String name = "Manikanta";
		String reverse = "";
		
		int num = name.length();

		for(int i=num-1;i>=0;i--)
		{
			reverse = reverse+name.charAt(i);
			
		}
		System.out.println("the String is reversed: "+reverse);
	
		StringBuilder sb = new StringBuilder(name);
		StringBuilder reverse1 = sb.reverse();
		System.out.println("the reverse String is by inbuilt fulction: "+reverse1);
	}

}
