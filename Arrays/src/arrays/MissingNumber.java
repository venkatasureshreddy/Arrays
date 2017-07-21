/*Missing Number
 * 
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * For example,
 * Given nums = [0, 1, 3] return 2.
 *
 *Solution :: Remove sum of array from sum of natural numbers.
 * 
 */
package arrays;
public class MissingNumber {

	public int missingNumber(int[] nums) {
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum = sum + nums[i];
		}
		int n = nums.length;
		return (n*(n+1))/2 - sum;
		}

	public static void main(String[] args) {
		int nums [] = new int[] {0,1,2,3,4,6};
		MissingNumber obj = new MissingNumber();
		System.out.println(obj.missingNumber(nums));
	}

}
