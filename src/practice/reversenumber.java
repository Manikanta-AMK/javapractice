package practice;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("please eneter the number");
		int num = sc.nextInt();
////		int rev = 0;
//		
//		while(num!=0)
//		{
//			rev = rev*10 + num%10;.
//			num=num/10;
//		}
//		System.out.println("reverse number is "+rev);
		
		StringBuffer sb  = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		sbl.reverse();
		System.out.println("reverse number is "+rev + "and" +"reverse number is "+rev );
		
	}
	
	
}
