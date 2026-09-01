package allIntegerPrograms;

public class numberreverse {

	public static void main(String[] args) {
		
		int number = 123456;
		int rev = 0;
		
		while(number!=0)
		{
			rev= rev*10 + number%10;
			number = number/10;
			
		}
		System.out.println(rev);
		
		// reversing the number by converting in to string
		
		  int num1 = 12345;

	        // Convert number to string
	        String str = String.valueOf(num1);

	        // Reverse the string
	        String rev1 = "";
	        for (int i = str.length() - 1; i >= 0; i--) {
	            rev1 = rev1 + str.charAt(i);
	        }

	        // Convert back to number (optional)
	        int reversedNum = Integer.parseInt(rev1);

	        System.out.println("Reversed number: " + reversedNum);
	}
}
