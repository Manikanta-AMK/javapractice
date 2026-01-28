package practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class countOfRepeatedChars {

	public static void main(String[] args) {
		
		String words = "AABBEFGRHUDF";
		
		HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
		
		for(int i=0;i<words.length();i++)
		{
			char ch = words.charAt(i);
			
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else {
				hm.put(ch, 1);
			}
		}
		System.out.println("the count of the repeated words "+hm);
		
		
		for(Entry<Character, Integer> entry: hm.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println("the key is "+entry.getKey());
			}
		}
	}
}
