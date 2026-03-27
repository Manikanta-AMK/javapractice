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
		
		int array[] = {1,5,1,4,7,1,5,8,8,88,52,55};
		int j = 0;
		int largestnumber2 = Integer.MAX_VALUE;
		for(int largest2: array)
		{
			if(largest2>largestnumber2)
			{
				largestnumber2=largest2;
			}
		}
		
		System.out.println("larger is: "+largestnumber2);
		
		for(int largest2 : array)
		{
		    if(largest2 > largestnumber2)
		    {
		        largestnumber2 = largest2;
		    }
		}
		System.out.println("largest is: " + largestnumber2);
		
		
		
	}
}
