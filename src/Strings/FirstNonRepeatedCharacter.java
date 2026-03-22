package Strings;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		
		String name = "automation";
		
		for(int i=0;i<name.length();i++)
		{
			char ch = name.charAt(i);
			
			if(name.indexOf(ch)==name.lastIndexOf(ch))
			{
				System.out.println("FirstNonRepeatedCharacter: "+ch);
				break;  // break will break the entire loop execution
			}
		}
		
		String name2 = "Manikanta";
		String name3 = name2.toLowerCase();   // converted to lower case
		for(int i=0;i<name3.length();i++)
		{
			char ch = name3.charAt(i);
			
			if(name3.indexOf(ch)==name3.lastIndexOf(ch))
			{
				System.out.println("FirstNonRepeatedCharacter is: "+ ch);
				break; // break will break the entire loop execution
			}
		}
		
		String stringname = "automationtester";
		String name4 = stringname.toLowerCase();
		for(int i=0;i<name4.length();i++)
		{
			char ch = name4.charAt(i);
			
			if(name4.indexOf(ch)==name4.lastIndexOf(ch))
			{
				System.out.println("nonrepeated letter: "+ch);
				break;
			}
		}
		
		String name5 = "jkskcdnvdl";
		
		for(int i=0;i<name5.length();i++)
		{
			char ch = name5.charAt(i);
			
			if(name5.indexOf(ch)==name5.lastIndexOf(ch))
			{
				System.out.println("first nonrepeated char is: "+ch);
				break;
			}
			
		}
		
	}
}
