package practice;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the number");
		int number = scanner.nextInt();
		if(isprime(number))
		{
			System.out.println(number + " is prime number");
		}else {
			System.out.println(number + " is not prime number");
		}
	}
	
	public static boolean isprime(int num)
	{
		for(int i=2;i<num/2;i++)
		{
			if(num %i==0)
			{
				return false;
			}
		}return true;
		System.out.println("yes");
	}

}
