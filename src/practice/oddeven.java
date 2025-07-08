package practice;

import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("please enter the number");
		int number = scanner.nextInt();
		if(number%2==0)
		{
			System.out.println(number + " is even number");
		}else {
			System.out.println(number + " is odd number");
		}

		System.out.println("yes");
			
	}
}
