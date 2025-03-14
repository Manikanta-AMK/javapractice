package exceptions;

import java.util.Scanner;

public class checkedexception {

	public static void main(String[] args) {
		
		String a = null;
		int b;
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("please enter the number");
		int c = sc.nextInt();
		
		try {
			System.out.println(a.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("Execution completed");
		
	}
}
