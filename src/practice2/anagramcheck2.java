package practice2;

import java.util.Arrays;

public class anagramcheck2 {

	public static boolean  isAnagram(String s1, String s2)
	{
		s1 = s1.replaceAll("\\s", "").toLowerCase();
		s2 = s2.replaceAll("\\s", "").toLowerCase();
		
		if(s1.length()!=s2.length())
		{
			return false;
		}
		
		char[] array1 = s1.toCharArray();
		char[] array2 = s2.toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
	
		return Arrays.equals(array1,array2);
		
	}
	
	public static void main(String[] args) {
		System.out.println(isAnagram("Manikanta","atankinam"));
	}
	
	

}
