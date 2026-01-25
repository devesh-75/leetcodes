class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums.length <= 1)
        {
            return 0;
        }
        int min = Math.abs(nums[0]-nums[k-1]);

        for(int i=k;i<nums.length;i++)
        {  
            int count = Math.abs(nums[i]-nums[i-(k-1)]);
            min = Math.min(min,count);
        }
        return min;
    }
}