package practice2;

public class primeNumber {
	
	public static void main(String[] args) {
		
		int number =8;
		
		for(int i=2;i<number/2;i++)
		{
			if(number%i==0)
			{
				System.out.println("number is prime number");
			}else {
				System.out.println("number is not prime number");
			}
		}

//		if (isPrime(number)) {
//			System.out.println(number + " is a prime number.");
//		} else {
//			System.out.println(number + " is not a prime number.");
//		}
//	}
//
//	public static boolean isPrime(int num) {
//		for (int i = 2; i <= num / 2; i++) {
//			// try each number by using %
//			if (num % i == 0) {
//				return false;
//			}
//		}
//		
	}

}
