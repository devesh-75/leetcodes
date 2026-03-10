class Solution {
    public int minLength(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();

        int l = 0;
        long distinctSum = 0;
        int ans = Integer.MAX_VALUE;

        for(int r = 0; r < nums.length; r++)
        {
            map.put(nums[r], map.getOrDefault(nums[r],0)+1);

            if(map.get(nums[r]) == 1)
                distinctSum += nums[r];

            while(distinctSum >= k)
            {
                ans = Math.min(ans, r - l + 1);

                map.put(nums[l], map.get(nums[l]) - 1);

                if(map.get(nums[l]) == 0)
                {
                    distinctSum -= nums[l];
                    map.remove(nums[l]);
                }

                l++;
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}