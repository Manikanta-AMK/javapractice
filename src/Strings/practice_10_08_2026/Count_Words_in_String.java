package Strings.practice_10_08_2026;

public class Count_Words_in_String {

	public static void main(String[] args) {
		
		String name = "Manikanta Arige scds";
		
		//with inbuilt method
		String[] words = name.split(" ");
		
		System.out.println("count of the words is: "+ words.length);
		
		//without inbuilt method
		int count =0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)==' ')
			{
				count++;
			}
			
		}
		System.out.println(count+1);
	}
}
