package Strings.practice_10_08_2026;

public class findingOtherCharactersInString {

	public static void main(String[] args) {

		String name = "jdfgrerwf2567898@#$%^&*(*&6";
		char letter = ' ';
		int numbers = 0;
		char specialchars = ' ';
		
		for(char ch : name.toCharArray())
		{
			if(Character.isLetter(ch))
			{
				letter = ch;
			}
			if(Character.isDigit(ch))
			{
				numbers = ch;
			}
			if(!Character.isLetterOrDigit(ch))
			{
				specialchars = ch;
			}
		}
		System.out.println("letters: "+letter);
		System.out.println("numbers: "+numbers);
		System.out.println("specialchars: "+specialchars);
	}

}
