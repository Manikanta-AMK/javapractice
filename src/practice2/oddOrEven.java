package practice2;

import java.util.Scanner;

public class oddOrEven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number");
		int number = sc.nextInt();
		if(number%2==0)
		{
			System.out.println("the number is even");
		}else {
			System.out.println("the number is Odd");
		}
		
	}
}
