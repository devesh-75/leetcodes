class Solution {
    public int findClosestNumber(int[] nums) {
        int min = 100001;
        int ans1 = 0;
        for(int i=0; i<nums.length; i++)
        {
            int x = nums[i];
            int diff = Math.abs(x - 0);
            if(x > 0) 
            {
                if (min >= diff)
                {
                    ans1 = x;
                    min = diff;
                }
            }
            else 
            {
                if(min > diff)
                {
                    ans1 = x;
                    min = diff;
                }    
            }
        }
        return ans1;
    }
}