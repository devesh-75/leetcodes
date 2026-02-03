class Solution {
    public boolean isTrionic(int[] nums) {

        if(nums[1] <= nums[0] || nums[nums.length-1] <= nums[nums.length-2] || nums.length == 3)
        {
            return false;
        }
        for(int i = 0 ; i<nums.length-1; i++)
        {
            if(nums[i] == nums[i+1])
            {
                return false;
            }
        }
        int count = 0;
        int p = 0;
        int q = 0;
        for(int i=1; i<nums.length-1; i++)
        {
            if(nums[i] > nums[i+1] && nums[i] > nums[i-1])
            {
                count++;
                p = i;
                break;
            }
        }
        for(int i=p+1; i<nums.length-1;i++)
        {
            if(nums[i] < nums[i+1] && nums[i] < nums[i-1])
            {
                count++;
                q = i;
                break;
            }
        }
        for(int i = q + 1; i<nums.length; i++)
        {
            if(nums[i] < nums[i-1])
            {
                return false;
            }
        }
        if( q > p && q < nums.length-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}