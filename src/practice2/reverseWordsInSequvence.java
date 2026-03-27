package practice2;

public class reverseWordsInSequvence {
	
	public static void main(String[] args) {
		
		String name = "manikanta Arige";
		String[] words = name.split(" ");
		String reverse = " ";
//		for(String word: words)
//		{
//			String sb = new StringBuilder(word).reverse().toString();
//				System.out.print(sb+" ");
//		}
	
		// without inbuilt methods
		
		for(String word: words)
		{
				for(int i=word.length()-1;i>=0;i--)
				{
					reverse = reverse+word.charAt(i);
				}reverse = reverse+ " ";
			}
		System.out.println(reverse);
		
	}

}
