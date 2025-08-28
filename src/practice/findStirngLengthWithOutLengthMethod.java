package practice;

public class findStirngLengthWithOutLengthMethod {

	public static void main(String[] args) {
		
		String name = "Manikanta";
		int count = 0;
		for(char ch: name.toCharArray())
		{
			count++;
		}
		System.out.println("Lenght of the String is: "+count);
	}
}
