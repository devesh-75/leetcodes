class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        List<Integer>arr = new ArrayList<>();
        int j = 0;
        Set<Integer> set = new HashSet<>();
        for(int i= nums.length-1; i>=0 ; i--)
        {
            if(!set.contains(nums[i]))
            {
                arr.add(nums[i]);      
                set.add(nums[i]);
                j++;
                if(j == k)
                {
                    break;
                }  
            }
            
        }
        int[] ans = new int[arr.size()];

        for(int i = 0; i < arr.size(); i++)
        {
            ans[i] = arr.get(i);
        }   
        return ans;
    }
}