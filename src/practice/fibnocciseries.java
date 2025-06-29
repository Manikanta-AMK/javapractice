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
	}
}
