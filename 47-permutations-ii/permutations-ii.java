class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        func(nums,nums.length,0,ans);
        return ans;
    }
    public static void func(int[]nums,int n, int ind, List<List<Integer>> ans)
    {
        if(ind == n)
        {
            List<Integer> arr = new ArrayList<>();
            for(int i=0; i<n; i++)
            {
                arr.add(nums[i]);
            }
            ans.add(new ArrayList<>(arr));
            return;
        }
        Set<Integer> set = new HashSet<>();
        for(int i=ind; i<n; i++)
        {
            if(set.contains(nums[i])) continue;
            
            set.add(nums[i]);
            swap(nums,i,ind);
            func(nums,n,ind+1,ans);
            swap(nums,ind,i);
        }
    }
    public static int[] swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }

}