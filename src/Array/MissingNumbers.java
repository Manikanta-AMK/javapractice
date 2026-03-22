package Array;

import java.util.HashSet;

public class MissingNumbers {

	public static void main(String[] args) {
		
		int array[] = {1, 2, 4, 6, 3, 7, 8};
		int N= 8;
		
		HashSet<Integer> set = new HashSet<>();
		
		for(Integer number: array)
		{
			set.add(number);
		}
		
		System.out.println("Missing Numbers are: ");
		
		for(int i=1;i<=N;i++)
		{
			if(!set.contains(i))
			{
				System.out.println(i+" ");
			}
		}
		
		int[] arr = {1, 2, 6, 3, 7, 8};
		int n = 8;
		
		HashSet<Integer> set1 = new HashSet<>();
		
		for(Integer num: arr)
		{
			set1.add(num);
		}
		System.out.println("Missing numbers are: ");
		for(int i=1;i<=n;i++)
		{
			if(!set1.contains(i))
			{
				System.out.println(i);
			}
		}
		
		
	}
}
