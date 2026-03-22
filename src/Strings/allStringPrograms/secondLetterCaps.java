package Strings.allStringPrograms;

public class secondLetterCaps {

	public static void main(String[] args) {
		
		String name = "manikanta";
		String[] s = name.split(" ");
		for(String c: s)
		{
			String first = c.substring(0,1).toLowerCase();
			String secondletter = c.substring(1,2).toUpperCase();
			String rest =c.substring(2).toLowerCase();
			System.out.println(first+secondletter+rest+" ");
		}
	}
}
