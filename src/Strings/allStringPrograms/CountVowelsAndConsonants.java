package Strings.allStringPrograms;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		
		String name = "Manikanta Arige";
		char[] ch = name.toCharArray();
		int countOfVowels = 0;
		int countOfConsonents = 0;
		
		for(char c: ch)
		{
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				countOfVowels++;
			}else {
				countOfConsonents++;
			}
		}
		System.out.println("count of the vovels is: "+countOfVowels);
		System.out.println("count of the vovels is: "+countOfConsonents);
	}
}
