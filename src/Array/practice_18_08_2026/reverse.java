package Array.practice_18_08_2026;

public class reverse {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 5, 2, 5, 4, 5, 5, 85, 85, 8, 8 };
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+",");
		}
	}
}
