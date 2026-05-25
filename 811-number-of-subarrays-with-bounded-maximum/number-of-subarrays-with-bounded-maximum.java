class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {

        int l = 0;
        int r = 0;
        int c = 0;
        int max = -1; 

        while(r < nums.length)
        {
            if(nums[r] > right)
            {
                l = r + 1;
                max = -1;
            }
            else
            {
                if(nums[r] >= left)
                {
                    max = r;
                }

                if(max != -1)
                {
                    c += (max - l + 1);
                }
            }

            r++;
        }

        return c;
    }
}