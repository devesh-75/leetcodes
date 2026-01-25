class Solution {
    public int minimumAverageDifference(int[] nums) {
        long total = 0;
        for(int num : nums){
            total += num;
        }
        long min = Long.MAX_VALUE;
        long prefix = 0;
        long suffix = total;
        int ans = 0;
        for(int i=0; i<nums.length; i++)
        {
            prefix += nums[i];
            long avg1 = prefix / (i+1);
            
            suffix -= nums[i];
            long avg2 = 0;
            if(i != nums.length - 1){
                avg2 = suffix / (nums.length-(i+1));
            }
            else
            {
                avg2 = 0;
            }
            long diff = Math.abs(avg1-avg2);
            if(diff < min)
            {
                min = diff;
                ans = i;
            }
        }
        return ans;
    }
}