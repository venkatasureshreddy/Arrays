/*Remove Element
 * 
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * 
 * Given input array nums = [3,2,2,3], val = 3
 * Your function should return length = 2, with the first two elements of nums being 2.
 * @ Suresh Reddy
 */


package arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int nums[] = new int[] { 1, 2, 3, 2, 1 };
		int val = 2;
		RemoveElement obj = new RemoveElement();
		System.out.println(obj.removeElement(nums, val));
	}

	public int removeElement(int[] nums, int val) {

		int k = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[k] = nums[i];
				k++;
			}
		}
		return k;
	}
}
