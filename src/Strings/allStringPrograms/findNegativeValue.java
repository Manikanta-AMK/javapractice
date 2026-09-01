package Strings.allStringPrograms;

import java.util.ArrayList;
import java.util.List;

public class findNegativeValue {
	
	public static void main(String[] args) {
		
		int[] arr = {1,5,7,8,-2,-40,-20};
		
		List<Integer> postive = new ArrayList<>();
		List<Integer> negative = new ArrayList<>();
		List<Integer> aboveten = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				negative.add(arr[i]);
			}
			else if(arr[i]>0)
			{
				postive.add(arr[i]);
			}
			else {
				aboveten.add(arr[i]);
			}
		}
		
		System.out.println(negative);
		System.out.println(postive);
		System.out.println(aboveten);
		
	}

}
