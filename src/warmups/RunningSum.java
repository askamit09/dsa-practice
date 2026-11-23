/*
 * 1480. Running Sum of 1d Array — https://leetcode.com/problems/running-sum-of-1d-array/
 * Pattern:  prefix sum (in place)
 * Approach: each element += previous element
 * Time: O(n)   Space: O(1) extra (modifies input)
 * Date: 2026-11-23   Assisted: no
 */


package warmups;

public class RunningSum {
    public int[] runningSum(int[] nums) {
        if(nums.length < 2){
            return nums;
        }
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}