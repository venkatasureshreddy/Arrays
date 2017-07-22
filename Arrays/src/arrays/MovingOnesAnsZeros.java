package arrays;

public class MovingOnesAnsZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = new int[] {2,3,0,4,0,5,1,0};
		int result [] = new int[nums.length];
		
		int k=1;
		int j=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == 0){
				result[nums.length-k] = nums[i];
				k++;
			}else {
				result[j] = nums[i];
				j++;
			}
			
		}
		
		for(int i=0;i<result.length;i++) {
			System.err.print(result[i]);
			
		}

	}

}
