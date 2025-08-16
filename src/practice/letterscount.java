package practice;

public class letterscount {

	public static void main(String[] args) {
		
		String name = "Manikanta Arige";
		char target = 'a';
		int count =0;
		
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)== target || name.charAt(i)== Character.toUpperCase(target))
			{
				count++;
			}
		}
		System.out.println("the count of a is: "+ count);
		String change = name.toLowerCase().replace("a", "");
		System.out.println("a letters are removed "+change);
	}
	
}
