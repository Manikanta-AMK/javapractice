package practice;

public class reverseSpecificword {
	
	public static void main(String[] args) {
		
		String name ="welcome to java";
		String[] words = name.split(" ");
		StringBuilder result = new StringBuilder();
		for(String word: words)
		{
			if(word.equals("welcome"))
			{
				String reversedword = new StringBuilder(word).reverse().toString();
				result.append(reversedword);
			}else {
				result.append(word);
			}
			result.append(" ");
		}
		System.out.println(result.toString().trim());
	}

}

