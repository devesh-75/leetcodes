class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum = 0;
        int l = 0;
        int r = 0;
        int max1 = 0;
        int max2 = 0;
        while(r<nums.length)
        {
            sum += nums[r];
            if(sum < 0)
            {
                sum = 0;
            }
            max1 = Math.max(max1, sum);
            r++;
        }
        sum = 0;
        while(l<nums.length)
        {
            sum += nums[l];
            if(sum > 0)
            {
                sum = 0;
            }

            max2 = Math.min(max2, sum);
            l++;
        }

        return Math.max(Math.abs(max2), max1);
    }
}