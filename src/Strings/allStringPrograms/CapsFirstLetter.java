package Strings.allStringPrograms;

public class CapsFirstLetter {

	public static void main(String[] args) {
		
//		String name = "manikanta arige";
//		String[] words = name.split(" ");
//		
//		for(String word: words)
//		{
//			String first = word.substring(0,1).toUpperCase();
//			String rest = word.substring(1).toLowerCase();
//			System.out.print(first+rest+" ");
//		}
//		
		
		String name1 = "manikant arige software";
		String[] words1 = name1.split(" ");
		
		for(String word: words1)
		{
			String firstword = word.substring(0,1).toUpperCase();
			String secondword = word.substring(1);
			System.out.print(firstword+secondword+" ");
		}
	
	}
}
