package Strings.allStringPrograms;

public class FindLengthOfStringWithoutUsingLengthMethod {

	public static void main(String[] args) {
		
		String name = "Manikanta";
		int count=0;
		
		for(char ch:name.toCharArray())
		{
			count++;
		}
		System.out.println(count);
	}
}
