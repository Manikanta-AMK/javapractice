package StringProgramsPractice;

public class reverseWordInSequence {

	public static void main(String[] args) {
		
		String name = "welcome to session";
		String[] name2 = name.split(" ");
		
		//reverse statement in sequence
		StringBuilder reversed = new StringBuilder();
		String reversedword = ""; 
		for(int i=name2.length-1;i>=0;i--)
		{
			reversed.append(name2[i]);
			if(i!=0)
			{ 
				reversed.append(" ");
			}
		}System.out.println("reversed words are: "+reversed);
		
		//reverse specific word
		
		for (String word : name2) 
		{
			if (word.equals("session")) 
			{
				for (int i = word.length() - 1; i >= 0; i--)
				{
					reversedword = reversedword+word.charAt(i);
				}
			}
		}System.out.println("reversed word is: "+reversedword);

	}
}
