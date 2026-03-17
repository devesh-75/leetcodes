class Solution {
    public int[] singleNumber(int[] nums) {
        int sum1 = nums[0];
        for(int i=1; i<nums.length; i++)
        {
            sum1 = sum1^nums[i];
        }
        sum1 = (sum1 & (sum1 - 1)) ^ sum1;
        int n1 = 0;
        int n2 = 0;
        for(int i=0; i<nums.length; i++)
        {
            if((nums[i] & sum1) != 0)
            {
                n1 = n1^nums[i];
            }
            else
            {
                n2 = n2^nums[i];
            }
        }
        return new int[]{n1,n2};
    }
}