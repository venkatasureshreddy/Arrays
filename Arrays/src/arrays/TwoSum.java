package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
		
		// map with key as number and values as indexes.
		// find difference and check weather it contains in in that key 
		// if present then return vale with that key and index of difference number
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++) {
			int comp = target-nums[i];
			if(map.containsKey(comp)) {
				return new int[] {map.get(comp),i};
			}
			map.put(nums[i],i);
			}
		throw new IllegalArgumentException("No indexes found"); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = new int[] {2,7,11,15};
		int target= 13;
		
		TwoSum obj = new TwoSum();
		System.out.println(obj.twoSum(nums, target)[0] + " "+ obj.twoSum(nums, target)[1]);
		
	}	
		
}
