package Array;

public class largestNumberInArray {

	public static void main(String[] args) {
		 int b[] = {100,200,300,400,500};
		 int i=0;
		int largestnumber =  Integer.MIN_VALUE;
		for(int largest: b)
		{
			if(largest>largestnumber)
			{
				 i = largest;
			}
		}
		System.out.println("largest number is: "+i);
	}
}
