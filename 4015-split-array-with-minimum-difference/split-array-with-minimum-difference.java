class Solution {
    public long splitArray(int[] nums) {
        int n = nums.length;
        int i = 0, j = n - 1;     
        long sumL = nums[i], sumR = nums[j]; 

        while (i < n - 1 && nums[i] < nums[i + 1]) 
            sumL += nums[++i];

        while (j > 0 && nums[j - 1] > nums[j]) 
            sumR += nums[--j];

        if (i == j) 
            return Math.abs(Math.max(sumL, sumR) - nums[i] - Math.min(sumL, sumR));

        if (j == i + 1) 
            return Math.abs(sumR - sumL);
        return -1;
    }
}