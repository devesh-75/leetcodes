class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        long sum = 0;
        for(int i = 0; i<n; i++)
        {
            sum += (long)nums[i];
        }
        long Sn = (long)n*(n+1)/2;
        Sn = Sn - (long) sum;
        return (int) Sn;
    }
}