package Strings.practice_10_08_2026;

public class LengthofStringwithoutusinglength {
	
	public static void main(String[] args) {
		
		String name = "manikanta";
		int count = 0;
		
		for(char ch: name.toCharArray())
		{
			count++;
		}
		System.out.println(count);
	}

}
