class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        int r = 0;
        int max1 = 0;
        int max2 = 0;
        while(r<nums.length)
        {
            sum1 += nums[r];
            sum2 += nums[r];
            if(sum1 < 0)
            {
                sum1 = 0;
            }
            if(sum2 > 0)
            {
                sum2 = 0;
            }
            max2 = Math.min(max2, sum2);
            max1 = Math.max(max1, sum1);
            r++;
        }

        return Math.max(Math.abs(max2), max1);
    }
}