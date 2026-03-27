package practice2;

public class lettersCount {

	public static void main(String[] args) {
		
		String name = "dsddfbdsafdsfbf";
		char target = 'd';
		int count = 0;
		
		for(int i =0;i<name.length();i++)
		{
			if(name.charAt(i)==target)
			{
				count++;
			}
		}
		System.out.println("the count of the letter is "+count);
	}
}
