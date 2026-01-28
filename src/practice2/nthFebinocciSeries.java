package practice2;

import java.util.Scanner;

public class nthFebinocciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number");
		int number = sc.nextInt();
		
		if(number<=1)
		{
			System.out.println("nth febinocci series is: "+number);
			return;
		}
		
		int a=0, b=1, c=0;
		
		for(int i=2;i<=number;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println("nth number so b is: "+ b);
	}
}
