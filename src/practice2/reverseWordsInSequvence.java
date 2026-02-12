package practice2;

public class reverseWordsInSequvence {
	
	public static void main(String[] args) {
		
		String name = "manikanta Arige";
		String[] words = name.split(" ");
	
		for(String word: words)
		{
			String sb = new StringBuilder(word).reverse().toString();
				System.out.print(sb+" ");
		}
	
		
	}

}
