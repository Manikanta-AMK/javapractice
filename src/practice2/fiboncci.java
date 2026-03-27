package practice2;

import java.util.Scanner;

public class fiboncci {

	public static void main(String[] args) {
		
		int number = 5;
		int first  =0;
		int second =1;
		int next;
		
		for(int i=0;i<=number;i++)
		{
			System.out.println(first+"");
			next = second+first;
			first = second;
			second = next;
		}
		
		
	}
}
