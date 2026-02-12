package practice2;

import java.util.HashMap;

public class characterOccurance {

	public static void main(String[] args) {
		
		String name = "Automation";
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(char ch: name.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		System.out.println(map);
	}
}
