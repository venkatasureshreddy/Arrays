/*Remove Duplicates from Sorted Array
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * For example,
 * Given input array nums = [1,1,2],
 *Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. 
 *It doesn't matter what you leave beyond the new length.
 */
package arrays;

public class RemoveDuplicatesFromSortedArray {

	public int removeDuplicates(int[] nums) {
        if(nums.length == 0) 
        	return 0;
        int k =0;
        for(int i=1;i<nums.length;i++){
            if(nums[k]!=nums[i]){
                k++;
                nums[k]=nums[i];
            }
        }
        for(int i=0;i<k+1;i++){
        	System.out.print(nums[i]+"\t");
        }
        return (k+1);
    }
	public static void main(String[] args){
		RemoveDuplicatesFromSortedArray obj =  new RemoveDuplicatesFromSortedArray();
		int[] nums =  {1,1,2,3,4,5,6};
		int len= obj.removeDuplicates(nums);
		System.out.println("\nlength:"+len);
		
	}
}
