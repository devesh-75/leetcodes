class Solution {
    public long maximumTripletValue(int[] nums) {

        long maxNum = nums[0];
        long maxDiff = 0;
        long ans = 0;

        for(int k = 1; k < nums.length; k++)
        {
            ans = Math.max(ans, maxDiff * nums[k]);

            maxDiff = Math.max(maxDiff, maxNum - nums[k]);

            maxNum = Math.max(maxNum, nums[k]);
        }

        return ans;
    }
}