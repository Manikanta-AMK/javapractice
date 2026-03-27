package allIntegerPrograms;

public class FindFirstAndLastDigit {

	public static void main(String[] args) {
		
		int num = 123456;
		
		int lastdigit = num%10;
		
		while(num>=10)
		{
			num = num/10;
		}
		int firstdigit = num;
		
		System.out.println("first digit"+firstdigit);
		System.out.println("last digit"+lastdigit);
	}
}
