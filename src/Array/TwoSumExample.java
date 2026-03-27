package Array;

import java.util.HashMap;

public class TwoSumExample {
	
    public static void main(String[] args) {
        int[] arr = {6, 8, 11, 6, 7, 18};
        int target = 17;

        int[] result = findTwoSum(arr, target);

        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers add up to " + target);
        }
    }
    
    public static int[] findTwoSum(int[] nums, int target)
    {	
        HashMap<Integer, Integer> map = new HashMap<>(); // value -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return null; // no solution
    }
}
