package Strings.allStringPrograms;

public class secondLetterCaps {

	public static void main(String[] args) {
		
		String name = "manikanta";
		String[] s = name.split(" ");
		for(String c: s)
		{
			String first = c.substring(0,2).toLowerCase();
			String secondletter = c.substring(2,3).toUpperCase();
			String rest =c.substring(3).toLowerCase();
			System.out.println(first+secondletter+rest+" ");
		}
	}
}
