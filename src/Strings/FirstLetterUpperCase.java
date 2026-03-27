package Strings;

public class FirstLetterUpperCase {

	public static void main(String[] args) {
		
		String name = "java is easy to learn";
		String[] words = name.split(" ");
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		
		for(String word:words)
		{
			if(!word.isEmpty())
			{
				sb.append(Character.toUpperCase(word.charAt(0))+word.substring(1)).append(" ");
			}
		}System.out.println(sb);
		
		for(String wd:words)
		{
			sb1.append(wd.substring(0, 1).toUpperCase()).append(wd.substring(1)).append(" ");
		}System.out.println(sb1);
	}
}
