package allIntegerPrograms;

public class ProductOfDigits {

	public static void main(String[] args) {
		
		int number = 12546213;
		int product = 1;
		while(number>0)
		{
			int digit = number%10;
			product = product*digit;
			number = number/10;
		}
		System.out.println(product);
	}
}
