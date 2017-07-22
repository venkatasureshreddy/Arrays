/*Move Zeros ::
 * Given an array nums, write a function to move all 0's to the end of it 
 * while maintaining the relative order of the non-zero elements.
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0]
 * 
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 *
 * @Suresh Reddy
 */


package arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = new int[] { 0, 1, 0, 3, 12 };
		MoveZeroes obj = new MoveZeroes();
		obj.moveZeroes(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print("\t" + nums[i]);
		}
	}

	public void moveZeroes(int[] nums) {

		int k = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[k] = nums[i];
				k++;
			}
		}
		while (k < nums.length) {
			nums[k] = 0;
			k++;
		}
	}
}
