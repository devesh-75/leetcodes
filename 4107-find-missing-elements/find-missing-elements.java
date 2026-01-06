class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = 0;
        List<Integer> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int j=0; j<nums.length; j++)
        {
            max = Math.max(max, nums[j]);
            min = Math.min(min, nums[j]);
        }
        int [] arr = new int[max + 1];
        for(int n : nums)
        {
            arr[n]++;
        }
        for(int i=min; i<arr.length; i++)
        {
            if(arr[i] != 1)
            {
                ans.add(i);
            }
            
        }
        return ans;
    }
}