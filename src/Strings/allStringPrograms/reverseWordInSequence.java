package Strings.allStringPrograms;

public class reverseWordInSequence {

	public static void main(String[] args) {
		
		String name  = "Manikanta Arige";
		String[] words= name.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int i=words.length-1;i>=0;i--)
		{
			sb.append(words[i]);
			if(i!=0)
			{
				sb.append(" ");
			}
		}
		System.out.println(sb);
	}
}
