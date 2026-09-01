package Array.practice_18_08_2026;

public class LargestNumber {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 5, 2, 5, 4, 5, 5, 85, 85, 8, 8 };
		int largest = arr[0];
		int smallest = arr[0];

		//largest number
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println("largest number is: " + largest);
		
		//smallest number
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("largest number is: " + smallest);
		
	}

}
