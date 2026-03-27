package Array;

public class evenNumbersFromArray {

	public static void main(String[] args) {
		
		int numbers[] = {1,2,3,4,5,6,7,8};
		
		for(int even: numbers)
		{
			if(even%2==0)
			{
				System.out.println("even number is: "+even);
			}
		}
		
		
		
	}
}
