package Array;

public class secondLargetNumberWithoutSorting {

	public static void main(String[] args) {
		
		int[] arr = {5,8,7,3,110,11,1654};
		int first = arr[0];
		int second = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>first)
			{
				second = first;
				first = arr[i];
			}
//			else if(arr[i]>second) 
//			{
//				second = arr[i]; 
//			}
		}
		System.out.println("second largest number in an unsorted array is: "+second);
	}
}
