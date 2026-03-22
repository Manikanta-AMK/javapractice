package allIntegerPrograms;

public class CountDigitsInANumber {

	public static void main(String[] args) {
		
		int number = 123456789;
		int count=0;
		
		// identify with string length by converting the number in to string format
//		String num = String.valueOf(number);
//		System.out.println(num.length());
		
		// by using the while loop we can identify the count of digits
		while(number>0)
		{
			number = number/10;
			count++;
		}
		System.out.println("the count of digits: "+count);
	}
}
