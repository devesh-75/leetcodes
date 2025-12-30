class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>resultfinal = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(resultfinal, new ArrayList<>(), nums, 0);  
        return resultfinal;      
    }
    public void backtrack(List<List<Integer>>resultset, List<Integer>tempset, int nums[], int start)
    {
        if(resultset.contains(tempset))
        return;

        resultset.add(new ArrayList<>(tempset));
        for(int i=start; i<nums.length; i++)
        {
            tempset.add(nums[i]);
            backtrack(resultset, tempset, nums, i+1);
            tempset.remove(tempset.size()-1);
        }
    }
}