package practice;

public class revereWordSequvence {

	public static void main(String[] args) {
		String name="welcome to java again";
		String[] words = name.split(" ");
		StringBuilder reversed = new StringBuilder();
		
		for(int i=words.length-1;i>=0;i--)
		{
			reversed.append(words[i]);
			if(i!=0)
			{
				reversed.append(" ");
			}
			
		}
		System.out.println(reversed.toString());
	}
}
