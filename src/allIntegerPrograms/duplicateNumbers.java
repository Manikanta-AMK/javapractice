package allIntegerPrograms;

import java.util.HashSet;

public class duplicateNumbers {

	public static void main(String[] args) {
		
		int number = 115565235;
		String num = String.valueOf(number);
		
		HashSet<Character> uniqset = new HashSet<>();
		HashSet<Character> duplicate  = new HashSet<>();
		
		for(char ch: num.toCharArray())
		{
			if(!uniqset.add(ch))
			{
				duplicate.add(ch);
			}
		}
		System.out.println("uniq set numbers: "+ uniqset);
		System.out.println("duplicate set numbers: "+duplicate);
		
	}
}
