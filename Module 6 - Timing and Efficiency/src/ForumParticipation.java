import java.math.*;

public class ForumParticipation {

	public static void main(String[] args) {
		int[] nums = new int[] {4,1,0};
		 System.out.println(findMin(nums));

	}




	public static int findMin(int[] nums) {
		if (nums.length == 0) {
			return nums[0];			
		}
		else {
			return findMinHelper(nums,0, nums.length-1);
		}
						
	}
	
	//if reached final index return the number at that index
	//else continue in the array and return the result of min(current, next)
	private static int findMinHelper(int[] nums, int start, int end) {
		if (start == end) { //base case, reached end of array
			return nums[end];
		}
		else {//recursion case
			return Math.min(nums[start], findMinHelper(nums, start+1, end));
		}		
	}
}
