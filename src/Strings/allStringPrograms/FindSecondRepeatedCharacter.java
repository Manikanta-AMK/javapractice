package Strings.allStringPrograms;

import java.util.HashSet;

public class FindSecondRepeatedCharacter {

	public static void main(String[] args) {
		
		String name = "manikanta";
		
		HashSet<Character> set  =new HashSet<>();
		int count = 0;
		for(char ch: name.toCharArray())
		{
			if(set.contains(ch))
			{
				count++;
				if(count==2)
				{
					System.out.println("Second Repeated character is: "+ch);
				}
			}else {
			set.add(ch);
			}
		}
	}
}
