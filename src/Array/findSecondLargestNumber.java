package Array;

import java.util.Arrays;

public class findSecondLargestNumber {

	public static void main(String[] args) {
		
		 int b[] = {100,200,300,400,500};
		 
		 int firstlarge = Integer.MIN_VALUE;
		 int secondlarge = Integer.MIN_VALUE;
		 
		 for(int secondlargestnumber: b)
		 {
			 if(secondlargestnumber> firstlarge)
			 {
				 secondlarge = firstlarge;
				 firstlarge = secondlargestnumber;
			 }
		 }
		 System.out.println("Second largest number is: " + secondlarge);
		 
		 Arrays.sort(b);
		 
		 System.out.println("Second largest number is: "+ b[b.length-2]);
	}
}
