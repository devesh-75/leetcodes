class Solution {
    int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        func(0,n,nums,target);
        return count;
    }
    public void func(int i,int n,int []nums, int target)
    {
        if(i == n)
        {
            if(target == 0)
                count++;
            return;
        }
        
        func(i+1, n, nums, target-nums[i]);
        func(i+1, n, nums, target+nums[i]);
    }
}