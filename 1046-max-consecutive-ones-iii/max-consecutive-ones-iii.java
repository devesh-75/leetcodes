class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int r=0;
        int maxlen=0;
        int zero=0;
        while(r<nums.length)
        {
            if(nums[r] == 0)
            {
                zero++;
            }
            if(zero > k)
            {
                if(nums[l] == 0)
                {
                    zero--;
                }
                l++;
            }
            if(zero <= k)
            {
                maxlen = Math.max(r-l+1, maxlen);
            }
            r++;
        }
        return maxlen;
    }
}