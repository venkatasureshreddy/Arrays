/*Contains Duplicate
 * 
 * Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice in the array, 
 * and it should return false if every element is distinct.
 */
package arrays;
public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {

		boolean bool = false;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					bool = true;
				}
			}
		}
		return bool;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 1 };
		ContainsDuplicate obj = new ContainsDuplicate();
		System.out.println(obj.containsDuplicate(arr));;
		
}
}