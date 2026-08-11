class Solution {
    public int missingInteger(int[] nums) {
        int prefix = nums[0];
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i] != nums[i-1]+1) break;
            else prefix += nums[i];
        }
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++)
        {
            set.add(nums[i]);
        }
        int sum = 50*(50+1)/2;
        if(!set.contains(prefix)) 
            return prefix;
        else
        {
            for(int i=prefix+1; i<=sum; i++)
            {
                if(!set.contains(i))
                return i;
            }
        }
        return nums[0]+1;
    }
}