package exceptions;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class unchcheckexception {

	/* checked exceptions
	       IoException
	       File not found
	       Interpreted exception
	  unchecked exception
	       ArithmeticException exception
	       ArrayIndexOutofBondException
	       NullPointer exception */
	
	public static void main(String[] args) {
		
		//unchecked exception -ArithmeticException
		int a=100;
		int b =2;
		
		System.out.println(a/b);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number ");
		int i = sc.nextInt();
		
		System.out.println(a/i);
		
		//arrayIndexOutOfBondException
		
		int m[] = new int[5];
		
		System.out.println("please enter position of the array");
		int c = sc.nextInt();
		System.out.println("please enter the value");
		int value = sc.nextInt();
		
		m[c]=value;
		System.out.println("number added in array");	
		
		//number formate exception
		
		/*String s = "1234";
		String s = "let'sgo";
		int e = Integer.parseInt(s);
		System.out.println(e);*/
		
			
		//nullpointerexception
		
		String s2 = null;
		s2.length();
		
	}
}
	