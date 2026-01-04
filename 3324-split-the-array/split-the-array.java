class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Arrays.sort(nums);
        int n = 0;
        int count = 1;
        for(int i=1; i<nums.length;i++)
        {
            if(nums[n] == nums[i])
            {
                count++;
                if(count >= 3)
                {
                    return false;
                }
            }
            else
            {
                n = i;
                count = 1;
            }
        }
        return true;
    }
}