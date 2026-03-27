package practice;

import java.util.Scanner;

public class fibnocciseries {

	public static void main(String[] args) {
		
		int number = 6;
		int first =0;
		int second = 1; 
		int next;
		
		for(int i=0;i<=number;i++)
		{
			System.out.print(first + "");
			next=first+second;
			first=second;
			second=next;
		}
		System.out.println(" ");
		int number1 = 6;
		int first1 =0;
		int second1=1;
		int next1;
		
		for(int i=0;i<=number1;i++)
		{
			System.out.print(first1+ "");
			next1=first1+second1;
			first1=second1;
			second1=next1;
		}
		
		
		
	}
}
