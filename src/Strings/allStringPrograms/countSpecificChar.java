package Strings.allStringPrograms;

public class countSpecificChar {

	public static void main(String[] args) {
		
		String name = "manikanta";
		char target = 'a';
		int count=0;
		
		for(char ch: name.toCharArray())
		{
			if(ch==target) 
			{
				count++;
			}
		}
		System.out.println("count of the "+target+" is: "+count);
	}
	
}
