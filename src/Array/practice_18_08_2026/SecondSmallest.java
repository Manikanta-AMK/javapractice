package Array.practice_18_08_2026;

public class SecondSmallest {

	public static void main(String[] args) {
		
		int[] arr = {5,15,1,6,5,15,15,415,15,1,5,1,};
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<smallest)
			{
				secondSmallest = smallest; 
				smallest = arr[i];
			}
			else if(arr[i]<secondSmallest && arr[i] !=smallest)
			{
				secondSmallest = arr[i];
			}
			
		}
		System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + secondSmallest);
	
	}
	
}
