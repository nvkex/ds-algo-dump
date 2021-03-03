// Problem Link:
// https://leetcode.com/problems/missing-number/
//
class Solution {
    public int missingNumber(int[] nums) {
        int l = nums.length;
        int sum = 0;
        for(int i=0;i<l;i++)
            sum+=nums[i];
        
        return (l*(l+1)/2) - sum;
    }
}