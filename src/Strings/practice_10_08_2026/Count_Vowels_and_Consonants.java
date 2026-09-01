package Strings.practice_10_08_2026;

public class Count_Vowels_and_Consonants {

	public static void main(String[] args) {
		
		String name = "manikanta";
		int vovels = 0;
		int consonents = 0;
		
		for(char ch: name.toCharArray())
		{
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				vovels++;
			}
			else {
				consonents++;
			}
		}
		System.out.println("count of vovels: "+vovels);
		System.out.println("count of consonents: "+consonents);
	}
}
