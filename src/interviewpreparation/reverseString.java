package interviewpreparation;

public class reverseString {

	public static void main(String[] args) {
		
		String name = "Manikanta";
		String reverse = "";
		// reverse with inbuilt methods
		
		StringBuilder sb = new StringBuilder(name).reverse();
		System.out.println("reverse with inbuilt function: "+sb);
		
		// reverse with loop
		
		for(int i=name.length()-1;i>=0;i--)
		{
			reverse = reverse+name.charAt(i);
		}
		System.out.println("reverse with  for loop: "+reverse);
		
		
	}
	
}
