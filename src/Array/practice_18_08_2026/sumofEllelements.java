package Array.practice_18_08_2026;

public class sumofEllelements {

	public static void main(String[] args) {
		
		int[] arr = {15,48,5,61,64,46,5,98};
		int sum = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum = sum+arr[i];
		}System.out.println("sum of the elements: "+sum);
	}
}
